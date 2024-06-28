package com.ajay.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {

    public boolean authenticate(String username, String password) {
        boolean isValidUserName = username.equalsIgnoreCase("ajay");
        boolean isValidUserPassword = password.equalsIgnoreCase("123");
        return isValidUserName && isValidUserPassword;
    }
}
