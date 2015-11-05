package com.cbi.eis.security;

import com.cbi.eis.entity.User;

public interface SessionCredentials {
    User getCurrentUser();

}
