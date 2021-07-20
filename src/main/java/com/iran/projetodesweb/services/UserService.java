package com.iran.projetodesweb.services;

import org.springframework.security.core.context.SecurityContextHolder;

import com.iran.projetodesweb.security.UserSS;

public class UserService {
	
	public static UserSS authenticated() {
		try {
			return (UserSS) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		}
		catch (Exception e) {
			return null;
		}
	}
}
