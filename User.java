package com.example.Website.domain;

public interface User {
     // create a user method
	public boolean createUser(String name,String gender, String location, String college);
	public Integer saveUser();
}
