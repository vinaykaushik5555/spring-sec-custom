package com.vinay.sec.springmvcsec.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.UserDetailsManager;

import com.vinay.sec.springmvcsec.model.User;
import com.vinay.sec.springmvcsec.service.AppUsersManager;

@Configuration
public class ProjectConfig {

	@Bean
	PasswordEncoder passwordEncoder() {
		return new PlainPasswordEncoder();

	}

	@Bean
	UserDetailsManager userDeatilsManager() {
		UserDetailsManager manager= new AppUsersManager();
		manager.createUser(new User("Vinay", "1"));

		System.out.println(manager);
		return
				 manager;
	}

}
