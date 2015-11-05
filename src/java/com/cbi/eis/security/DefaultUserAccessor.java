package com.cbi.eis.security;

import java.util.List;

import com.cbi.eis.entity.User;
import com.cbi.eis.persistence.PersistenceAware;
import com.cbi.eis.persistence.PersistenceException;
import com.cbi.eis.persistence.PersistenceManager;
import com.cbi.eis.util.StringUtils;
public class DefaultUserAccessor implements UserAccessor, PersistenceAware {
	private PersistenceManager pm;
	private StringUtils su = new StringUtils();
	
	public boolean authenticate(String username, String password) {
		User user = getByUsername(username);

		if (user == null || !user.getPassword().equals(su.encodeBase64(password))) {
			return false;
		} else {
			return true;
		}
	}
	
	public User getByUsername(String username) {
		try {
			return (User) pm.getByUniqueField(User.class, username, "username");
		} catch (PersistenceException e) {
			return null;
		}
	}
	public void signup(User user) {
		pm.save(user);
	}
	public void setPersistenceManager(PersistenceManager pm) {
		this.pm = pm;
	}

	public void update(User userEdited) {
		pm.save(userEdited);
		
	}
	public User getById(String userId) {
		
		return (User) pm.getById(User.class, userId);
	}
	
	public List<User> findAllUser() {
        try {
			return pm.findAll(User.class);
        } catch (Exception e) {
            throw new PersistenceException(e);
        }
    }

	public void delete(User user) {
		pm.remove(user);
	}
}
