package com.vinay.sec.springmvcsec.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.provisioning.UserDetailsManager;

@Configuration
public class ProjectConfig {
	

	@Bean
	public UserDetailsManager userDetailsManager() {
		
		InMemoryUserDetailsManager im= new InMemoryUserDetailsManager();
		UserDetails user1= User.withUsername("vinay").password("{noop}1234").authorities("ROLE_USER").build();
		UserDetails user2= User.withUsername("admin").password("{noop}admin").authorities("ROLE_ADMIN").build();
		im.createUser(user1);
		im.createUser(user2);
		
		return im;
		
		
	}

}
