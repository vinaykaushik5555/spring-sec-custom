package com.vinay.sec.springmvcsec;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.vinay.sec.springmvcsec.model.User;
import com.vinay.sec.springmvcsec.service.AppUsersManager;

@SpringBootApplication
public class SpringMvcSecApplication {

	public static void main(String[] args) {
		ApplicationContext ap=SpringApplication.run(SpringMvcSecApplication.class, args);
		AppUsersManager usermanager=ap.getBean(AppUsersManager.class);
	
		System.out.println(usermanager.loadUserByUsername("Vinay"));
		
		System.out.println(usermanager.userExists("Vinay"));
		
	}

}
