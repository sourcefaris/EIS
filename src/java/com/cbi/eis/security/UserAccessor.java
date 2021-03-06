package com.cbi.eis.security;

import java.util.List;

import com.cbi.eis.entity.User;


public interface UserAccessor {
    boolean authenticate(String username, String password);

    void signup(User user);

    User getByUsername(String username);
    
    User getById(String userId);

	void update(User userEdited);
	
	void delete(User user);
	
	List findAllUser();
}
