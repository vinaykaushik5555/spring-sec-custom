package com.vinay.sec.springmvcsec.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.provisioning.UserDetailsManager;

public class AppUsersManager implements UserDetailsManager {

	// in memory users , instead of picking from DB for simplicity purpose
	List<UserDetails> appUsers = new ArrayList();
	

	public List<UserDetails> getAppUsers() {
		return appUsers;
	}

	public void setAppUsers(List<UserDetails> appUsers) {
		this.appUsers = appUsers;
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		return appUsers.stream().filter(user -> user.getUsername().equals(username)).findFirst()
				.orElseThrow(() -> new UsernameNotFoundException("User not found"));
	}

	@Override
	public void createUser(UserDetails user) {
		appUsers.add(user);
	}

	@Override
	public void updateUser(UserDetails user) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteUser(String username) {
		// TODO Auto-generated method stub

	}

	@Override
	public void changePassword(String oldPassword, String newPassword) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean userExists(String username) {

		return appUsers.stream().filter(user -> user.getUsername().equals(username)).findFirst().isPresent();
	}

}
