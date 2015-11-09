package com.cbi.eis.controller.module;

import com.cbi.eis.entity.ModuleFunction;

public class WheelMenuPosition extends ModuleForm{
	/* Master */
	private ModuleFunction A;
	private ModuleFunction B;
	private ModuleFunction C;
	private ModuleFunction D;
	private ModuleFunction E;
	private ModuleFunction F;
	private ModuleFunction G;
	private ModuleFunction H;
	private ModuleFunction I;
	private ModuleFunction J;
	private ModuleFunction K;
	private ModuleFunction L;

	private ModuleFunction A_0;
	private ModuleFunction A_1;
	private ModuleFunction A_2;
	private ModuleFunction A_3;
	private ModuleFunction A_4;
	private ModuleFunction A_5;
	private ModuleFunction A_6;
	private ModuleFunction A_7;
	private ModuleFunction A_8;
	private ModuleFunction A_9;

	private ModuleFunction B_0;
	private ModuleFunction B_1;
	private ModuleFunction B_2;
	private ModuleFunction B_3;
	private ModuleFunction B_4;
	private ModuleFunction B_5;
	private ModuleFunction B_6;
	private ModuleFunction B_7;
	private ModuleFunction B_8;
	private ModuleFunction B_9;

	private ModuleFunction C_0;
	private ModuleFunction C_1;
	private ModuleFunction C_2;
	private ModuleFunction C_3;
	private ModuleFunction C_4;
	private ModuleFunction C_5;
	private ModuleFunction C_6;
	private ModuleFunction C_7;
	private ModuleFunction C_8;
	private ModuleFunction C_9;

	private ModuleFunction D_0;
	private ModuleFunction D_1;
	private ModuleFunction D_2;
	private ModuleFunction D_3;
	private ModuleFunction D_4;
	private ModuleFunction D_5;
	private ModuleFunction D_6;
	private ModuleFunction D_7;
	private ModuleFunction D_8;
	private ModuleFunction D_9;

	private ModuleFunction E_0;
	private ModuleFunction E_1;
	private ModuleFunction E_2;
	private ModuleFunction E_3;
	private ModuleFunction E_4;
	private ModuleFunction E_5;
	private ModuleFunction E_6;
	private ModuleFunction E_7;
	private ModuleFunction E_8;
	private ModuleFunction E_9;

	private ModuleFunction F_0;
	private ModuleFunction F_1;
	private ModuleFunction F_2;
	private ModuleFunction F_3;
	private ModuleFunction F_4;
	private ModuleFunction F_5;
	private ModuleFunction F_6;
	private ModuleFunction F_7;
	private ModuleFunction F_8;
	private ModuleFunction F_9;

	private ModuleFunction G_0;
	private ModuleFunction G_1;
	private ModuleFunction G_2;
	private ModuleFunction G_3;
	private ModuleFunction G_4;
	private ModuleFunction G_5;
	private ModuleFunction G_6;
	private ModuleFunction G_7;
	private ModuleFunction G_8;
	private ModuleFunction G_9;

	private ModuleFunction H_0;
	private ModuleFunction H_1;
	private ModuleFunction H_2;
	private ModuleFunction H_3;
	private ModuleFunction H_4;
	private ModuleFunction H_5;
	private ModuleFunction H_6;
	private ModuleFunction H_7;
	private ModuleFunction H_8;
	private ModuleFunction H_9;

	private ModuleFunction I_0;
	private ModuleFunction I_1;
	private ModuleFunction I_2;
	private ModuleFunction I_3;
	private ModuleFunction I_4;
	private ModuleFunction I_5;
	private ModuleFunction I_6;
	private ModuleFunction I_7;
	private ModuleFunction I_8;
	private ModuleFunction I_9;

	private ModuleFunction J_0;
	private ModuleFunction J_1;
	private ModuleFunction J_2;
	private ModuleFunction J_3;
	private ModuleFunction J_4;
	private ModuleFunction J_5;
	private ModuleFunction J_6;
	private ModuleFunction J_7;
	private ModuleFunction J_8;
	private ModuleFunction J_9;

	private ModuleFunction K_0;
	private ModuleFunction K_1;
	private ModuleFunction K_2;
	private ModuleFunction K_3;
	private ModuleFunction K_4;
	private ModuleFunction K_5;
	private ModuleFunction K_6;
	private ModuleFunction K_7;
	private ModuleFunction K_8;
	private ModuleFunction K_9;

	private ModuleFunction L_0;
	private ModuleFunction L_1;
	private ModuleFunction L_2;
	private ModuleFunction L_3;
	private ModuleFunction L_4;
	private ModuleFunction L_5;
	private ModuleFunction L_6;
	private ModuleFunction L_7;
	private ModuleFunction L_8;
	private ModuleFunction L_9;
	
	@Override
	public String execute() throws Exception {
		if(getCurrentUser()==null){
			return "login";
		}
		A = persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.sorting='88'").size()>0?(ModuleFunction) persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.sorting='88'").get(0):null;
		B = persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.sorting='89'").size()>0?(ModuleFunction) persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.sorting='89'").get(0):null;
		C = persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.sorting='90'").size()>0?(ModuleFunction) persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.sorting='90'").get(0):null;
		D = persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.sorting='91'").size()>0?(ModuleFunction) persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.sorting='91'").get(0):null;
		E = persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.sorting='92'").size()>0?(ModuleFunction) persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.sorting='92'").get(0):null;
		F = persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.sorting='93'").size()>0?(ModuleFunction) persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.sorting='93'").get(0):null;
		G = persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.sorting='94'").size()>0?(ModuleFunction) persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.sorting='94'").get(0):null;
		H = persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.sorting='95'").size()>0?(ModuleFunction) persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.sorting='95'").get(0):null;
		I = persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.sorting='96'").size()>0?(ModuleFunction) persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.sorting='96'").get(0):null;
		J = persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.sorting='97'").size()>0?(ModuleFunction) persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.sorting='97'").get(0):null;
		K = persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.sorting='98'").size()>0?(ModuleFunction) persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.sorting='98'").get(0):null;
		L = persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.sorting='99'").size()>0?(ModuleFunction) persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.sorting='99'").get(0):null;
		
		A_0 = persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='88' AND mf.sorting='0'").size()>0?(ModuleFunction) persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='88' AND mf.sorting='0'").get(0):null;
		A_1 = persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='88' AND mf.sorting='1'").size()>0?(ModuleFunction) persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='88' AND mf.sorting='1'").get(0):null;
		A_2 = persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='88' AND mf.sorting='2'").size()>0?(ModuleFunction) persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='88' AND mf.sorting='2'").get(0):null;
		A_3 = persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='88' AND mf.sorting='3'").size()>0?(ModuleFunction) persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='88' AND mf.sorting='3'").get(0):null;
		A_4 = persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='88' AND mf.sorting='4'").size()>0?(ModuleFunction) persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='88' AND mf.sorting='4'").get(0):null;
		A_5 = persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='88' AND mf.sorting='5'").size()>0?(ModuleFunction) persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='88' AND mf.sorting='5'").get(0):null;
		A_6 = persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='88' AND mf.sorting='6'").size()>0?(ModuleFunction) persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='88' AND mf.sorting='6'").get(0):null;
		A_7 = persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='88' AND mf.sorting='7'").size()>0?(ModuleFunction) persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='88' AND mf.sorting='7'").get(0):null;
		A_8 = persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='88' AND mf.sorting='8'").size()>0?(ModuleFunction) persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='88' AND mf.sorting='8'").get(0):null;
		A_9 = persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='88' AND mf.sorting='9'").size()>0?(ModuleFunction) persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='88' AND mf.sorting='9'").get(0):null;
		
		B_0 = persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='89' AND mf.sorting='0'").size()>0?(ModuleFunction) persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='89' AND mf.sorting='0'").get(0):null;
		B_1 = persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='89' AND mf.sorting='1'").size()>0?(ModuleFunction) persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='89' AND mf.sorting='1'").get(0):null;
		B_2 = persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='89' AND mf.sorting='2'").size()>0?(ModuleFunction) persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='89' AND mf.sorting='2'").get(0):null;
		B_3 = persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='89' AND mf.sorting='3'").size()>0?(ModuleFunction) persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='89' AND mf.sorting='3'").get(0):null;
		B_4 = persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='89' AND mf.sorting='4'").size()>0?(ModuleFunction) persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='89' AND mf.sorting='4'").get(0):null;
		B_5 = persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='89' AND mf.sorting='5'").size()>0?(ModuleFunction) persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='89' AND mf.sorting='5'").get(0):null;
		B_6 = persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='89' AND mf.sorting='6'").size()>0?(ModuleFunction) persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='89' AND mf.sorting='6'").get(0):null;
		B_7 = persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='89' AND mf.sorting='7'").size()>0?(ModuleFunction) persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='89' AND mf.sorting='7'").get(0):null;
		B_8 = persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='89' AND mf.sorting='8'").size()>0?(ModuleFunction) persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='89' AND mf.sorting='8'").get(0):null;
		B_9 = persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='89' AND mf.sorting='9'").size()>0?(ModuleFunction) persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='89' AND mf.sorting='9'").get(0):null;

		C_0 = persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='90' AND mf.sorting='0'").size()>0?(ModuleFunction) persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='90' AND mf.sorting='0'").get(0):null;
		C_1 = persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='90' AND mf.sorting='1'").size()>0?(ModuleFunction) persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='90' AND mf.sorting='1'").get(0):null;
		C_2 = persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='90' AND mf.sorting='2'").size()>0?(ModuleFunction) persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='90' AND mf.sorting='2'").get(0):null;
		C_3 = persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='90' AND mf.sorting='3'").size()>0?(ModuleFunction) persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='90' AND mf.sorting='3'").get(0):null;
		C_4 = persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='90' AND mf.sorting='4'").size()>0?(ModuleFunction) persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='90' AND mf.sorting='4'").get(0):null;
		C_5 = persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='90' AND mf.sorting='5'").size()>0?(ModuleFunction) persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='90' AND mf.sorting='5'").get(0):null;
		C_6 = persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='90' AND mf.sorting='6'").size()>0?(ModuleFunction) persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='90' AND mf.sorting='6'").get(0):null;
		C_7 = persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='90' AND mf.sorting='7'").size()>0?(ModuleFunction) persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='90' AND mf.sorting='7'").get(0):null;
		C_8 = persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='90' AND mf.sorting='8'").size()>0?(ModuleFunction) persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='90' AND mf.sorting='8'").get(0):null;
		C_9 = persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='90' AND mf.sorting='9'").size()>0?(ModuleFunction) persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='90' AND mf.sorting='9'").get(0):null;

		D_0 = persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='91' AND mf.sorting='0'").size()>0?(ModuleFunction) persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='91' AND mf.sorting='0'").get(0):null;
		D_1 = persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='91' AND mf.sorting='1'").size()>0?(ModuleFunction) persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='91' AND mf.sorting='1'").get(0):null;
		D_2 = persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='91' AND mf.sorting='2'").size()>0?(ModuleFunction) persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='91' AND mf.sorting='2'").get(0):null;
		D_3 = persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='91' AND mf.sorting='3'").size()>0?(ModuleFunction) persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='91' AND mf.sorting='3'").get(0):null;
		D_4 = persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='91' AND mf.sorting='4'").size()>0?(ModuleFunction) persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='91' AND mf.sorting='4'").get(0):null;
		D_5 = persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='91' AND mf.sorting='5'").size()>0?(ModuleFunction) persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='91' AND mf.sorting='5'").get(0):null;
		D_6 = persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='91' AND mf.sorting='6'").size()>0?(ModuleFunction) persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='91' AND mf.sorting='6'").get(0):null;
		D_7 = persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='91' AND mf.sorting='7'").size()>0?(ModuleFunction) persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='91' AND mf.sorting='7'").get(0):null;
		D_8 = persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='91' AND mf.sorting='8'").size()>0?(ModuleFunction) persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='91' AND mf.sorting='8'").get(0):null;
		D_9 = persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='91' AND mf.sorting='9'").size()>0?(ModuleFunction) persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='91' AND mf.sorting='9'").get(0):null;

		E_0 = persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='92' AND mf.sorting='0'").size()>0?(ModuleFunction) persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='92' AND mf.sorting='0'").get(0):null;
		E_1 = persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='92' AND mf.sorting='1'").size()>0?(ModuleFunction) persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='92' AND mf.sorting='1'").get(0):null;
		E_2 = persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='92' AND mf.sorting='2'").size()>0?(ModuleFunction) persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='92' AND mf.sorting='2'").get(0):null;
		E_3 = persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='92' AND mf.sorting='3'").size()>0?(ModuleFunction) persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='92' AND mf.sorting='3'").get(0):null;
		E_4 = persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='92' AND mf.sorting='4'").size()>0?(ModuleFunction) persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='92' AND mf.sorting='4'").get(0):null;
		E_5 = persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='92' AND mf.sorting='5'").size()>0?(ModuleFunction) persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='92' AND mf.sorting='5'").get(0):null;
		E_6 = persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='92' AND mf.sorting='6'").size()>0?(ModuleFunction) persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='92' AND mf.sorting='6'").get(0):null;
		E_7 = persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='92' AND mf.sorting='7'").size()>0?(ModuleFunction) persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='92' AND mf.sorting='7'").get(0):null;
		E_8 = persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='92' AND mf.sorting='8'").size()>0?(ModuleFunction) persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='92' AND mf.sorting='8'").get(0):null;
		E_9 = persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='92' AND mf.sorting='9'").size()>0?(ModuleFunction) persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='92' AND mf.sorting='9'").get(0):null;

		F_0 = persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='93' AND mf.sorting='0'").size()>0?(ModuleFunction) persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='93' AND mf.sorting='0'").get(0):null;
		F_1 = persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='93' AND mf.sorting='1'").size()>0?(ModuleFunction) persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='93' AND mf.sorting='1'").get(0):null;
		F_2 = persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='93' AND mf.sorting='2'").size()>0?(ModuleFunction) persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='93' AND mf.sorting='2'").get(0):null;
		F_3 = persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='93' AND mf.sorting='3'").size()>0?(ModuleFunction) persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='93' AND mf.sorting='3'").get(0):null;
		F_4 = persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='93' AND mf.sorting='4'").size()>0?(ModuleFunction) persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='93' AND mf.sorting='4'").get(0):null;
		F_5 = persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='93' AND mf.sorting='5'").size()>0?(ModuleFunction) persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='93' AND mf.sorting='5'").get(0):null;
		F_6 = persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='93' AND mf.sorting='6'").size()>0?(ModuleFunction) persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='93' AND mf.sorting='6'").get(0):null;
		F_7 = persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='93' AND mf.sorting='7'").size()>0?(ModuleFunction) persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='93' AND mf.sorting='7'").get(0):null;
		F_8 = persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='93' AND mf.sorting='8'").size()>0?(ModuleFunction) persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='93' AND mf.sorting='8'").get(0):null;
		F_9 = persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='93' AND mf.sorting='9'").size()>0?(ModuleFunction) persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='93' AND mf.sorting='9'").get(0):null;

		G_0 = persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='94' AND mf.sorting='0'").size()>0?(ModuleFunction) persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='94' AND mf.sorting='0'").get(0):null;
		G_1 = persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='94' AND mf.sorting='1'").size()>0?(ModuleFunction) persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='94' AND mf.sorting='1'").get(0):null;
		G_2 = persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='94' AND mf.sorting='2'").size()>0?(ModuleFunction) persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='94' AND mf.sorting='2'").get(0):null;
		G_3 = persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='94' AND mf.sorting='3'").size()>0?(ModuleFunction) persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='94' AND mf.sorting='3'").get(0):null;
		G_4 = persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='94' AND mf.sorting='4'").size()>0?(ModuleFunction) persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='94' AND mf.sorting='4'").get(0):null;
		G_5 = persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='94' AND mf.sorting='5'").size()>0?(ModuleFunction) persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='94' AND mf.sorting='5'").get(0):null;
		G_6 = persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='94' AND mf.sorting='6'").size()>0?(ModuleFunction) persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='94' AND mf.sorting='6'").get(0):null;
		G_7 = persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='94' AND mf.sorting='7'").size()>0?(ModuleFunction) persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='94' AND mf.sorting='7'").get(0):null;
		G_8 = persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='94' AND mf.sorting='8'").size()>0?(ModuleFunction) persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='94' AND mf.sorting='8'").get(0):null;
		G_9 = persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='94' AND mf.sorting='9'").size()>0?(ModuleFunction) persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='94' AND mf.sorting='9'").get(0):null;

		H_0 = persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='95' AND mf.sorting='0'").size()>0?(ModuleFunction) persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='95' AND mf.sorting='0'").get(0):null;
		H_1 = persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='95' AND mf.sorting='1'").size()>0?(ModuleFunction) persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='95' AND mf.sorting='1'").get(0):null;
		H_2 = persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='95' AND mf.sorting='2'").size()>0?(ModuleFunction) persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='95' AND mf.sorting='2'").get(0):null;
		H_3 = persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='95' AND mf.sorting='3'").size()>0?(ModuleFunction) persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='95' AND mf.sorting='3'").get(0):null;
		H_4 = persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='95' AND mf.sorting='4'").size()>0?(ModuleFunction) persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='95' AND mf.sorting='4'").get(0):null;
		H_5 = persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='95' AND mf.sorting='5'").size()>0?(ModuleFunction) persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='95' AND mf.sorting='5'").get(0):null;
		H_6 = persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='95' AND mf.sorting='6'").size()>0?(ModuleFunction) persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='95' AND mf.sorting='6'").get(0):null;
		H_7 = persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='95' AND mf.sorting='7'").size()>0?(ModuleFunction) persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='95' AND mf.sorting='7'").get(0):null;
		H_8 = persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='95' AND mf.sorting='8'").size()>0?(ModuleFunction) persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='95' AND mf.sorting='8'").get(0):null;
		H_9 = persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='95' AND mf.sorting='9'").size()>0?(ModuleFunction) persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='95' AND mf.sorting='9'").get(0):null;

		I_0 = persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='96' AND mf.sorting='0'").size()>0?(ModuleFunction) persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='96' AND mf.sorting='0'").get(0):null;
		I_1 = persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='96' AND mf.sorting='1'").size()>0?(ModuleFunction) persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='96' AND mf.sorting='1'").get(0):null;
		I_2 = persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='96' AND mf.sorting='2'").size()>0?(ModuleFunction) persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='96' AND mf.sorting='2'").get(0):null;
		I_3 = persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='96' AND mf.sorting='3'").size()>0?(ModuleFunction) persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='96' AND mf.sorting='3'").get(0):null;
		I_4 = persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='96' AND mf.sorting='4'").size()>0?(ModuleFunction) persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='96' AND mf.sorting='4'").get(0):null;
		I_5 = persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='96' AND mf.sorting='5'").size()>0?(ModuleFunction) persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='96' AND mf.sorting='5'").get(0):null;
		I_6 = persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='96' AND mf.sorting='6'").size()>0?(ModuleFunction) persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='96' AND mf.sorting='6'").get(0):null;
		I_7 = persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='96' AND mf.sorting='7'").size()>0?(ModuleFunction) persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='96' AND mf.sorting='7'").get(0):null;
		I_8 = persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='96' AND mf.sorting='8'").size()>0?(ModuleFunction) persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='96' AND mf.sorting='8'").get(0):null;
		I_9 = persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='96' AND mf.sorting='9'").size()>0?(ModuleFunction) persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='96' AND mf.sorting='9'").get(0):null;

		J_0 = persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='97' AND mf.sorting='0'").size()>0?(ModuleFunction) persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='97' AND mf.sorting='0'").get(0):null;
		J_1 = persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='97' AND mf.sorting='1'").size()>0?(ModuleFunction) persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='97' AND mf.sorting='1'").get(0):null;
		J_2 = persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='97' AND mf.sorting='2'").size()>0?(ModuleFunction) persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='97' AND mf.sorting='2'").get(0):null;
		J_3 = persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='97' AND mf.sorting='3'").size()>0?(ModuleFunction) persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='97' AND mf.sorting='3'").get(0):null;
		J_4 = persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='97' AND mf.sorting='4'").size()>0?(ModuleFunction) persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='97' AND mf.sorting='4'").get(0):null;
		J_5 = persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='97' AND mf.sorting='5'").size()>0?(ModuleFunction) persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='97' AND mf.sorting='5'").get(0):null;
		J_6 = persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='97' AND mf.sorting='6'").size()>0?(ModuleFunction) persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='97' AND mf.sorting='6'").get(0):null;
		J_7 = persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='97' AND mf.sorting='7'").size()>0?(ModuleFunction) persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='97' AND mf.sorting='7'").get(0):null;
		J_8 = persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='97' AND mf.sorting='8'").size()>0?(ModuleFunction) persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='97' AND mf.sorting='8'").get(0):null;
		J_9 = persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='97' AND mf.sorting='9'").size()>0?(ModuleFunction) persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='97' AND mf.sorting='9'").get(0):null;
		
		K_0 = persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='98' AND mf.sorting='0'").size()>0?(ModuleFunction) persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='98' AND mf.sorting='0'").get(0):null;
		K_1 = persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='98' AND mf.sorting='1'").size()>0?(ModuleFunction) persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='98' AND mf.sorting='1'").get(0):null;
		K_2 = persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='98' AND mf.sorting='2'").size()>0?(ModuleFunction) persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='98' AND mf.sorting='2'").get(0):null;
		K_3 = persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='98' AND mf.sorting='3'").size()>0?(ModuleFunction) persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='98' AND mf.sorting='3'").get(0):null;
		K_4 = persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='98' AND mf.sorting='4'").size()>0?(ModuleFunction) persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='98' AND mf.sorting='4'").get(0):null;
		K_5 = persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='98' AND mf.sorting='5'").size()>0?(ModuleFunction) persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='98' AND mf.sorting='5'").get(0):null;
		K_6 = persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='98' AND mf.sorting='6'").size()>0?(ModuleFunction) persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='98' AND mf.sorting='6'").get(0):null;
		K_7 = persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='98' AND mf.sorting='7'").size()>0?(ModuleFunction) persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='98' AND mf.sorting='7'").get(0):null;
		K_8 = persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='98' AND mf.sorting='8'").size()>0?(ModuleFunction) persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='98' AND mf.sorting='8'").get(0):null;
		K_9 = persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='98' AND mf.sorting='9'").size()>0?(ModuleFunction) persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='98' AND mf.sorting='9'").get(0):null;

		L_0 = persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='99' AND mf.sorting='0'").size()>0?(ModuleFunction) persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='99' AND mf.sorting='0'").get(0):null;
		L_1 = persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='99' AND mf.sorting='1'").size()>0?(ModuleFunction) persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='99' AND mf.sorting='1'").get(0):null;
		L_2 = persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='99' AND mf.sorting='2'").size()>0?(ModuleFunction) persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='99' AND mf.sorting='2'").get(0):null;
		L_3 = persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='99' AND mf.sorting='3'").size()>0?(ModuleFunction) persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='99' AND mf.sorting='3'").get(0):null;
		L_4 = persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='99' AND mf.sorting='4'").size()>0?(ModuleFunction) persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='99' AND mf.sorting='4'").get(0):null;
		L_5 = persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='99' AND mf.sorting='5'").size()>0?(ModuleFunction) persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='99' AND mf.sorting='5'").get(0):null;
		L_6 = persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='99' AND mf.sorting='6'").size()>0?(ModuleFunction) persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='99' AND mf.sorting='6'").get(0):null;
		L_7 = persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='99' AND mf.sorting='7'").size()>0?(ModuleFunction) persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='99' AND mf.sorting='7'").get(0):null;
		L_8 = persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='99' AND mf.sorting='8'").size()>0?(ModuleFunction) persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='99' AND mf.sorting='8'").get(0):null;
		L_9 = persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='99' AND mf.sorting='9'").size()>0?(ModuleFunction) persistence.getList("FROM "+ModuleFunction.class.getName()+" mf WHERE mf.moduleFunction.sorting='99' AND mf.sorting='9'").get(0):null;
		return SUCCESS;
	}
	
	public ModuleFunction getA() {
		return A;
	}
	public void setA(ModuleFunction a) {
		A = a;
	}
	public ModuleFunction getB() {
		return B;
	}
	public void setB(ModuleFunction b) {
		B = b;
	}
	public ModuleFunction getC() {
		return C;
	}
	public void setC(ModuleFunction c) {
		C = c;
	}
	public ModuleFunction getD() {
		return D;
	}
	public void setD(ModuleFunction d) {
		D = d;
	}
	public ModuleFunction getE() {
		return E;
	}
	public void setE(ModuleFunction e) {
		E = e;
	}
	public ModuleFunction getF() {
		return F;
	}
	public void setF(ModuleFunction f) {
		F = f;
	}
	public ModuleFunction getG() {
		return G;
	}
	public void setG(ModuleFunction g) {
		G = g;
	}
	public ModuleFunction getH() {
		return H;
	}
	public void setH(ModuleFunction h) {
		H = h;
	}
	public ModuleFunction getI() {
		return I;
	}
	public void setI(ModuleFunction i) {
		I = i;
	}
	public ModuleFunction getJ() {
		return J;
	}
	public void setJ(ModuleFunction j) {
		J = j;
	}
	public ModuleFunction getK() {
		return K;
	}
	public void setK(ModuleFunction k) {
		K = k;
	}
	public ModuleFunction getL() {
		return L;
	}
	public void setL(ModuleFunction l) {
		L = l;
	}
	public ModuleFunction getA_0() {
		return A_0;
	}
	public void setA_0(ModuleFunction a_0) {
		A_0 = a_0;
	}
	public ModuleFunction getA_1() {
		return A_1;
	}
	public void setA_1(ModuleFunction a_1) {
		A_1 = a_1;
	}
	public ModuleFunction getA_2() {
		return A_2;
	}
	public void setA_2(ModuleFunction a_2) {
		A_2 = a_2;
	}
	public ModuleFunction getA_3() {
		return A_3;
	}
	public void setA_3(ModuleFunction a_3) {
		A_3 = a_3;
	}
	public ModuleFunction getA_4() {
		return A_4;
	}
	public void setA_4(ModuleFunction a_4) {
		A_4 = a_4;
	}
	public ModuleFunction getA_5() {
		return A_5;
	}
	public void setA_5(ModuleFunction a_5) {
		A_5 = a_5;
	}
	public ModuleFunction getA_6() {
		return A_6;
	}
	public void setA_6(ModuleFunction a_6) {
		A_6 = a_6;
	}
	public ModuleFunction getA_7() {
		return A_7;
	}
	public void setA_7(ModuleFunction a_7) {
		A_7 = a_7;
	}
	public ModuleFunction getA_8() {
		return A_8;
	}
	public void setA_8(ModuleFunction a_8) {
		A_8 = a_8;
	}
	public ModuleFunction getA_9() {
		return A_9;
	}
	public void setA_9(ModuleFunction a_9) {
		A_9 = a_9;
	}
	public ModuleFunction getB_0() {
		return B_0;
	}
	public void setB_0(ModuleFunction b_0) {
		B_0 = b_0;
	}
	public ModuleFunction getB_1() {
		return B_1;
	}
	public void setB_1(ModuleFunction b_1) {
		B_1 = b_1;
	}
	public ModuleFunction getB_2() {
		return B_2;
	}
	public void setB_2(ModuleFunction b_2) {
		B_2 = b_2;
	}
	public ModuleFunction getB_3() {
		return B_3;
	}
	public void setB_3(ModuleFunction b_3) {
		B_3 = b_3;
	}
	public ModuleFunction getB_4() {
		return B_4;
	}
	public void setB_4(ModuleFunction b_4) {
		B_4 = b_4;
	}
	public ModuleFunction getB_5() {
		return B_5;
	}
	public void setB_5(ModuleFunction b_5) {
		B_5 = b_5;
	}
	public ModuleFunction getB_6() {
		return B_6;
	}
	public void setB_6(ModuleFunction b_6) {
		B_6 = b_6;
	}
	public ModuleFunction getB_7() {
		return B_7;
	}
	public void setB_7(ModuleFunction b_7) {
		B_7 = b_7;
	}
	public ModuleFunction getB_8() {
		return B_8;
	}
	public void setB_8(ModuleFunction b_8) {
		B_8 = b_8;
	}
	public ModuleFunction getB_9() {
		return B_9;
	}
	public void setB_9(ModuleFunction b_9) {
		B_9 = b_9;
	}
	public ModuleFunction getC_0() {
		return C_0;
	}
	public void setC_0(ModuleFunction c_0) {
		C_0 = c_0;
	}
	public ModuleFunction getC_1() {
		return C_1;
	}
	public void setC_1(ModuleFunction c_1) {
		C_1 = c_1;
	}
	public ModuleFunction getC_2() {
		return C_2;
	}
	public void setC_2(ModuleFunction c_2) {
		C_2 = c_2;
	}
	public ModuleFunction getC_3() {
		return C_3;
	}
	public void setC_3(ModuleFunction c_3) {
		C_3 = c_3;
	}
	public ModuleFunction getC_4() {
		return C_4;
	}
	public void setC_4(ModuleFunction c_4) {
		C_4 = c_4;
	}
	public ModuleFunction getC_5() {
		return C_5;
	}
	public void setC_5(ModuleFunction c_5) {
		C_5 = c_5;
	}
	public ModuleFunction getC_6() {
		return C_6;
	}
	public void setC_6(ModuleFunction c_6) {
		C_6 = c_6;
	}
	public ModuleFunction getC_7() {
		return C_7;
	}
	public void setC_7(ModuleFunction c_7) {
		C_7 = c_7;
	}
	public ModuleFunction getC_8() {
		return C_8;
	}
	public void setC_8(ModuleFunction c_8) {
		C_8 = c_8;
	}
	public ModuleFunction getC_9() {
		return C_9;
	}
	public void setC_9(ModuleFunction c_9) {
		C_9 = c_9;
	}
	public ModuleFunction getD_0() {
		return D_0;
	}
	public void setD_0(ModuleFunction d_0) {
		D_0 = d_0;
	}
	public ModuleFunction getD_1() {
		return D_1;
	}
	public void setD_1(ModuleFunction d_1) {
		D_1 = d_1;
	}
	public ModuleFunction getD_2() {
		return D_2;
	}
	public void setD_2(ModuleFunction d_2) {
		D_2 = d_2;
	}
	public ModuleFunction getD_3() {
		return D_3;
	}
	public void setD_3(ModuleFunction d_3) {
		D_3 = d_3;
	}
	public ModuleFunction getD_4() {
		return D_4;
	}
	public void setD_4(ModuleFunction d_4) {
		D_4 = d_4;
	}
	public ModuleFunction getD_5() {
		return D_5;
	}
	public void setD_5(ModuleFunction d_5) {
		D_5 = d_5;
	}
	public ModuleFunction getD_6() {
		return D_6;
	}
	public void setD_6(ModuleFunction d_6) {
		D_6 = d_6;
	}
	public ModuleFunction getD_7() {
		return D_7;
	}
	public void setD_7(ModuleFunction d_7) {
		D_7 = d_7;
	}
	public ModuleFunction getD_8() {
		return D_8;
	}
	public void setD_8(ModuleFunction d_8) {
		D_8 = d_8;
	}
	public ModuleFunction getD_9() {
		return D_9;
	}
	public void setD_9(ModuleFunction d_9) {
		D_9 = d_9;
	}
	public ModuleFunction getE_0() {
		return E_0;
	}
	public void setE_0(ModuleFunction e_0) {
		E_0 = e_0;
	}
	public ModuleFunction getE_1() {
		return E_1;
	}
	public void setE_1(ModuleFunction e_1) {
		E_1 = e_1;
	}
	public ModuleFunction getE_2() {
		return E_2;
	}
	public void setE_2(ModuleFunction e_2) {
		E_2 = e_2;
	}
	public ModuleFunction getE_3() {
		return E_3;
	}
	public void setE_3(ModuleFunction e_3) {
		E_3 = e_3;
	}
	public ModuleFunction getE_4() {
		return E_4;
	}
	public void setE_4(ModuleFunction e_4) {
		E_4 = e_4;
	}
	public ModuleFunction getE_5() {
		return E_5;
	}
	public void setE_5(ModuleFunction e_5) {
		E_5 = e_5;
	}
	public ModuleFunction getE_6() {
		return E_6;
	}
	public void setE_6(ModuleFunction e_6) {
		E_6 = e_6;
	}
	public ModuleFunction getE_7() {
		return E_7;
	}
	public void setE_7(ModuleFunction e_7) {
		E_7 = e_7;
	}
	public ModuleFunction getE_8() {
		return E_8;
	}
	public void setE_8(ModuleFunction e_8) {
		E_8 = e_8;
	}
	public ModuleFunction getE_9() {
		return E_9;
	}
	public void setE_9(ModuleFunction e_9) {
		E_9 = e_9;
	}
	public ModuleFunction getF_0() {
		return F_0;
	}
	public void setF_0(ModuleFunction f_0) {
		F_0 = f_0;
	}
	public ModuleFunction getF_1() {
		return F_1;
	}
	public void setF_1(ModuleFunction f_1) {
		F_1 = f_1;
	}
	public ModuleFunction getF_2() {
		return F_2;
	}
	public void setF_2(ModuleFunction f_2) {
		F_2 = f_2;
	}
	public ModuleFunction getF_3() {
		return F_3;
	}
	public void setF_3(ModuleFunction f_3) {
		F_3 = f_3;
	}
	public ModuleFunction getF_4() {
		return F_4;
	}
	public void setF_4(ModuleFunction f_4) {
		F_4 = f_4;
	}
	public ModuleFunction getF_5() {
		return F_5;
	}
	public void setF_5(ModuleFunction f_5) {
		F_5 = f_5;
	}
	public ModuleFunction getF_6() {
		return F_6;
	}
	public void setF_6(ModuleFunction f_6) {
		F_6 = f_6;
	}
	public ModuleFunction getF_7() {
		return F_7;
	}
	public void setF_7(ModuleFunction f_7) {
		F_7 = f_7;
	}
	public ModuleFunction getF_8() {
		return F_8;
	}
	public void setF_8(ModuleFunction f_8) {
		F_8 = f_8;
	}
	public ModuleFunction getF_9() {
		return F_9;
	}
	public void setF_9(ModuleFunction f_9) {
		F_9 = f_9;
	}
	public ModuleFunction getG_0() {
		return G_0;
	}
	public void setG_0(ModuleFunction g_0) {
		G_0 = g_0;
	}
	public ModuleFunction getG_1() {
		return G_1;
	}
	public void setG_1(ModuleFunction g_1) {
		G_1 = g_1;
	}
	public ModuleFunction getG_2() {
		return G_2;
	}
	public void setG_2(ModuleFunction g_2) {
		G_2 = g_2;
	}
	public ModuleFunction getG_3() {
		return G_3;
	}
	public void setG_3(ModuleFunction g_3) {
		G_3 = g_3;
	}
	public ModuleFunction getG_4() {
		return G_4;
	}
	public void setG_4(ModuleFunction g_4) {
		G_4 = g_4;
	}
	public ModuleFunction getG_5() {
		return G_5;
	}
	public void setG_5(ModuleFunction g_5) {
		G_5 = g_5;
	}
	public ModuleFunction getG_6() {
		return G_6;
	}
	public void setG_6(ModuleFunction g_6) {
		G_6 = g_6;
	}
	public ModuleFunction getG_7() {
		return G_7;
	}
	public void setG_7(ModuleFunction g_7) {
		G_7 = g_7;
	}
	public ModuleFunction getG_8() {
		return G_8;
	}
	public void setG_8(ModuleFunction g_8) {
		G_8 = g_8;
	}
	public ModuleFunction getG_9() {
		return G_9;
	}
	public void setG_9(ModuleFunction g_9) {
		G_9 = g_9;
	}
	public ModuleFunction getH_0() {
		return H_0;
	}
	public void setH_0(ModuleFunction h_0) {
		H_0 = h_0;
	}
	public ModuleFunction getH_1() {
		return H_1;
	}
	public void setH_1(ModuleFunction h_1) {
		H_1 = h_1;
	}
	public ModuleFunction getH_2() {
		return H_2;
	}
	public void setH_2(ModuleFunction h_2) {
		H_2 = h_2;
	}
	public ModuleFunction getH_3() {
		return H_3;
	}
	public void setH_3(ModuleFunction h_3) {
		H_3 = h_3;
	}
	public ModuleFunction getH_4() {
		return H_4;
	}
	public void setH_4(ModuleFunction h_4) {
		H_4 = h_4;
	}
	public ModuleFunction getH_5() {
		return H_5;
	}
	public void setH_5(ModuleFunction h_5) {
		H_5 = h_5;
	}
	public ModuleFunction getH_6() {
		return H_6;
	}
	public void setH_6(ModuleFunction h_6) {
		H_6 = h_6;
	}
	public ModuleFunction getH_7() {
		return H_7;
	}
	public void setH_7(ModuleFunction h_7) {
		H_7 = h_7;
	}
	public ModuleFunction getH_8() {
		return H_8;
	}
	public void setH_8(ModuleFunction h_8) {
		H_8 = h_8;
	}
	public ModuleFunction getH_9() {
		return H_9;
	}
	public void setH_9(ModuleFunction h_9) {
		H_9 = h_9;
	}
	public ModuleFunction getI_0() {
		return I_0;
	}
	public void setI_0(ModuleFunction i_0) {
		I_0 = i_0;
	}
	public ModuleFunction getI_1() {
		return I_1;
	}
	public void setI_1(ModuleFunction i_1) {
		I_1 = i_1;
	}
	public ModuleFunction getI_2() {
		return I_2;
	}
	public void setI_2(ModuleFunction i_2) {
		I_2 = i_2;
	}
	public ModuleFunction getI_3() {
		return I_3;
	}
	public void setI_3(ModuleFunction i_3) {
		I_3 = i_3;
	}
	public ModuleFunction getI_4() {
		return I_4;
	}
	public void setI_4(ModuleFunction i_4) {
		I_4 = i_4;
	}
	public ModuleFunction getI_5() {
		return I_5;
	}
	public void setI_5(ModuleFunction i_5) {
		I_5 = i_5;
	}
	public ModuleFunction getI_6() {
		return I_6;
	}
	public void setI_6(ModuleFunction i_6) {
		I_6 = i_6;
	}
	public ModuleFunction getI_7() {
		return I_7;
	}
	public void setI_7(ModuleFunction i_7) {
		I_7 = i_7;
	}
	public ModuleFunction getI_8() {
		return I_8;
	}
	public void setI_8(ModuleFunction i_8) {
		I_8 = i_8;
	}
	public ModuleFunction getI_9() {
		return I_9;
	}
	public void setI_9(ModuleFunction i_9) {
		I_9 = i_9;
	}
	public ModuleFunction getJ_0() {
		return J_0;
	}
	public void setJ_0(ModuleFunction j_0) {
		J_0 = j_0;
	}
	public ModuleFunction getJ_1() {
		return J_1;
	}
	public void setJ_1(ModuleFunction j_1) {
		J_1 = j_1;
	}
	public ModuleFunction getJ_2() {
		return J_2;
	}
	public void setJ_2(ModuleFunction j_2) {
		J_2 = j_2;
	}
	public ModuleFunction getJ_3() {
		return J_3;
	}
	public void setJ_3(ModuleFunction j_3) {
		J_3 = j_3;
	}
	public ModuleFunction getJ_4() {
		return J_4;
	}
	public void setJ_4(ModuleFunction j_4) {
		J_4 = j_4;
	}
	public ModuleFunction getJ_5() {
		return J_5;
	}
	public void setJ_5(ModuleFunction j_5) {
		J_5 = j_5;
	}
	public ModuleFunction getJ_6() {
		return J_6;
	}
	public void setJ_6(ModuleFunction j_6) {
		J_6 = j_6;
	}
	public ModuleFunction getJ_7() {
		return J_7;
	}
	public void setJ_7(ModuleFunction j_7) {
		J_7 = j_7;
	}
	public ModuleFunction getJ_8() {
		return J_8;
	}
	public void setJ_8(ModuleFunction j_8) {
		J_8 = j_8;
	}
	public ModuleFunction getJ_9() {
		return J_9;
	}
	public void setJ_9(ModuleFunction j_9) {
		J_9 = j_9;
	}
	public ModuleFunction getK_0() {
		return K_0;
	}
	public void setK_0(ModuleFunction k_0) {
		K_0 = k_0;
	}
	public ModuleFunction getK_1() {
		return K_1;
	}
	public void setK_1(ModuleFunction k_1) {
		K_1 = k_1;
	}
	public ModuleFunction getK_2() {
		return K_2;
	}
	public void setK_2(ModuleFunction k_2) {
		K_2 = k_2;
	}
	public ModuleFunction getK_3() {
		return K_3;
	}
	public void setK_3(ModuleFunction k_3) {
		K_3 = k_3;
	}
	public ModuleFunction getK_4() {
		return K_4;
	}
	public void setK_4(ModuleFunction k_4) {
		K_4 = k_4;
	}
	public ModuleFunction getK_5() {
		return K_5;
	}
	public void setK_5(ModuleFunction k_5) {
		K_5 = k_5;
	}
	public ModuleFunction getK_6() {
		return K_6;
	}
	public void setK_6(ModuleFunction k_6) {
		K_6 = k_6;
	}
	public ModuleFunction getK_7() {
		return K_7;
	}
	public void setK_7(ModuleFunction k_7) {
		K_7 = k_7;
	}
	public ModuleFunction getK_8() {
		return K_8;
	}
	public void setK_8(ModuleFunction k_8) {
		K_8 = k_8;
	}
	public ModuleFunction getK_9() {
		return K_9;
	}
	public void setK_9(ModuleFunction k_9) {
		K_9 = k_9;
	}
	public ModuleFunction getL_0() {
		return L_0;
	}
	public void setL_0(ModuleFunction l_0) {
		L_0 = l_0;
	}
	public ModuleFunction getL_1() {
		return L_1;
	}
	public void setL_1(ModuleFunction l_1) {
		L_1 = l_1;
	}
	public ModuleFunction getL_2() {
		return L_2;
	}
	public void setL_2(ModuleFunction l_2) {
		L_2 = l_2;
	}
	public ModuleFunction getL_3() {
		return L_3;
	}
	public void setL_3(ModuleFunction l_3) {
		L_3 = l_3;
	}
	public ModuleFunction getL_4() {
		return L_4;
	}
	public void setL_4(ModuleFunction l_4) {
		L_4 = l_4;
	}
	public ModuleFunction getL_5() {
		return L_5;
	}
	public void setL_5(ModuleFunction l_5) {
		L_5 = l_5;
	}
	public ModuleFunction getL_6() {
		return L_6;
	}
	public void setL_6(ModuleFunction l_6) {
		L_6 = l_6;
	}
	public ModuleFunction getL_7() {
		return L_7;
	}
	public void setL_7(ModuleFunction l_7) {
		L_7 = l_7;
	}
	public ModuleFunction getL_8() {
		return L_8;
	}
	public void setL_8(ModuleFunction l_8) {
		L_8 = l_8;
	}
	public ModuleFunction getL_9() {
		return L_9;
	}
	public void setL_9(ModuleFunction l_9) {
		L_9 = l_9;
	}
	
	

}
