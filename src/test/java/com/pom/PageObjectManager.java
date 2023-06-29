package com.pom;

import com.pojo.Login;

public class PageObjectManager {
	
	private Login login;
	
	public Login getLogin() {
		return (login == null) ? login = new Login() : login;
	}


}
