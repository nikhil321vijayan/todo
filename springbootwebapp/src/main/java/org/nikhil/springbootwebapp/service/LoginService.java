package org.nikhil.springbootwebapp.service;

import org.springframework.stereotype.Component;

@Component
public class LoginService {
	
	public boolean validateUser(String userid, String password) {
		
		return userid.equalsIgnoreCase("nikhil") && password.equalsIgnoreCase("123");
	}

}
