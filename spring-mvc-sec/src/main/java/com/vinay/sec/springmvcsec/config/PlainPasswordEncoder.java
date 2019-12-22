package com.vinay.sec.springmvcsec.config;

import org.springframework.security.crypto.password.PasswordEncoder;

public class PlainPasswordEncoder  implements PasswordEncoder{

	@Override
	public String encode(CharSequence rawPassword) {
		// TODO Auto-generated method stub
		return rawPassword.toString();
	}

	@Override
	public boolean matches(CharSequence rawPassword, String encodedPassword) {
		// TODO Auto-generated method stub
		return rawPassword.equals(encodedPassword);
	}

}
