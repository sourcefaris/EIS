package com.cbi.eis.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.cbi.eis.DefaultAction;
import com.cbi.eis.security.LoginFilter;
import com.cbi.eis.util.StringUtils;
import com.opensymphony.xwork2.ActionContext;

import tableau.api.rest.bindings.GranteeCapabilitiesType;
import tableau.api.rest.bindings.PermissionsType;
import tableau.api.rest.bindings.SiteRoleType;
import tableau.api.rest.bindings.TableauCredentialsType;
import tableau.api.rest.bindings.TsResponse;
import tableau.api.rest.bindings.UserListType;
import tableau.api.rest.bindings.UserType;
import tableau.api.rest.bindings.ViewListType;
import tableau.api.rest.bindings.WorkbookListType;
import tableau.api.rest.bindings.WorkbookType;

public class TableauService extends DefaultAction{

	public static String getSourceViewURL(String clientRemoteAddress,
			String wgserver, String user, String destinationView, String params)
			throws Exception {

		String output = null;

		String ticket = getTrustedTicket(wgserver, user, clientRemoteAddress);

		if (!ticket.equals("-1")) {

			output = "http://" + wgserver + "/trusted/" + ticket + "/views/"
					+ destinationView + "?" + params;
		}

		else {

			output = "notallowed";
		}

		return output;
	}

	private static String getTrustedTicket(String wgserver, String user,
			String remoteAddr) {

		String output = null;

		OutputStreamWriter out = null;
		BufferedReader in = null;
		try {
			// Encode the parameters
			StringBuffer data = new StringBuffer();
			data.append(URLEncoder.encode("username", "UTF-8"));
			data.append("=");
			data.append(URLEncoder.encode(user, "UTF-8"));
			data.append("&");
			data.append(URLEncoder.encode("client_ip", "UTF-8"));
			data.append("=");
			data.append(URLEncoder.encode(remoteAddr, "UTF-8"));

			// Send the request
			URL url = new URL("http://" + wgserver + "/trusted");
			URLConnection conn = url.openConnection();
			conn.setDoOutput(true);
			out = new OutputStreamWriter(conn.getOutputStream());
			out.write(data.toString());
			out.flush();

			// Read the response
			StringBuffer rsp = new StringBuffer();
			in = new BufferedReader(
					new InputStreamReader(conn.getInputStream()));
			String line;

			while ((line = in.readLine()) != null) {
				rsp.append(line);
			}

			output = rsp.toString();

		} catch (Exception e) {

			e.printStackTrace();

		}

		finally {
			try {
				if (in != null)
					in.close();
				if (out != null)
					out.close();
			} catch (IOException e) {

				e.printStackTrace();

			}
		}

		return output;

	}
	
	private static TableauRestAPIService getTableauRestAPIService(){
		return TableauRestAPIService.instance();
	}
	
	public static TsResponse getSignInResponse(){
		String username = getCurrentUser().getUsername();
		String password = StringUtils.decodeBase64(getCurrentUser().getPassword());
		return getTableauRestAPIService().invokeSignIn(username, password, get("tableau.site.default.contentUrl"));
	}
	
	private static TableauCredentialsType getCredentials(){
		return (TableauCredentialsType) ActionContext.getContext().getSession().get(LoginFilter.LOGIN_TABLEAU_CREDENTIALS);
	}
	
	public static TsResponse getResponseQueryWorkbooks(int pageSize, int pageNumber){
		return getTableauRestAPIService().invokeQueryWorkbooks(getCredentials(), pageSize, pageNumber);
	}
	
	public static TsResponse getResponseQueryUsersOnSite(int pageSize, int pageNumber){
		return getTableauRestAPIService().invokeQueryUsersOnSite(getCredentials(), pageSize, pageNumber);
	}
	
	public static TsResponse updateUser(String userId, String fullName, String email, String password, String tableauRole){
		SiteRoleType siteRole = null;
		if (tableauRole.equalsIgnoreCase("GUEST"))
			siteRole = SiteRoleType.GUEST;
		else if (tableauRole.equalsIgnoreCase("INTERACTOR"))
			siteRole = SiteRoleType.INTERACTOR;
		else if(tableauRole.equalsIgnoreCase("PUBLISHER"))
			siteRole = SiteRoleType.PUBLISHER;
		else if(tableauRole.equalsIgnoreCase("SITE_ADMINISTRATOR"))
			siteRole = SiteRoleType.SITE_ADMINISTRATOR;
		else if(tableauRole.equalsIgnoreCase("UNLICENSED"))
			siteRole = SiteRoleType.UNLICENSED;
		else if(tableauRole.equalsIgnoreCase("UNLICENSED_WITH_PUBLISH"))
			siteRole = SiteRoleType.UNLICENSED_WITH_PUBLISH;
		else if(tableauRole.equalsIgnoreCase("VIEWER"))
			siteRole = SiteRoleType.VIEWER;
		else if(tableauRole.equalsIgnoreCase("VIEWER_WITH_PUBLISH"))
			siteRole = SiteRoleType.VIEWER_WITH_PUBLISH;
		return getTableauRestAPIService().invokeUpdateUser(getCredentials(), getUserTableau(userId), fullName, email, password, siteRole);
	}
	
	public static ViewListType getViews(String workbookId, int pageSize, int pageNumber){
		return getTableauRestAPIService().invokeQueryViews(getCredentials(), getCredentials().getSite().getId(), workbookId, pageSize, pageNumber);
	}
	
	public static UserType getUserTableau(String userId){
		return getTableauRestAPIService().invokeGetUser(getCredentials(), userId);
	}
	
	public static WorkbookType getWorkbook(String workbookId) {
		return getTableauRestAPIService().invokeGetWorkbook(getCredentials(), workbookId);
	}
	
	public static PermissionsType getWorkbookPermission (String workbookId) {
		return getTableauRestAPIService().invokeGetWorkbookPermission(getCredentials(), workbookId);
	}
	
	public static TsResponse addWorkbookPermission (String workbookId, String userId, String capabilityName, String capabilityMode) {
		Map<String, String> capabilities = new HashMap<String, String>();
		capabilities.put(capabilityName, capabilityMode);
		GranteeCapabilitiesType userCapabilities = getTableauRestAPIService().createUserGranteeCapability(getTableauRestAPIService().invokeGetUser(getCredentials(), userId), capabilities);
		List<GranteeCapabilitiesType> granteeCapabilities = new ArrayList<GranteeCapabilitiesType>();
		granteeCapabilities.add(userCapabilities);
		System.out.println(getCredentials().getSite().getId());		
		return getTableauRestAPIService().invokeAddPermissionsToWorkbook(getCredentials(), workbookId, granteeCapabilities);
	}
	
	public static void deleteWorkbookPermission(String workbookId, String userId, String capabilityName, String capabilityMode){
		getTableauRestAPIService().invokeDeletePermissionsToWorkbook(getCredentials(), workbookId, userId, capabilityName, capabilityMode);
	}

}
