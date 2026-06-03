package com.example.Website.service;

import com.example.Website.domain.User;

public interface UserServiceLayer {
	public User getUser();
	public boolean signup(String name, String gender, String location, String college);
	
}
