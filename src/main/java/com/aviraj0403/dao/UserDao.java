package com.aviraj0403.dao;

import com.aviraj0403.model.User;
public interface UserDao {

	boolean addUser(User user);
	boolean isValidUser(String username, String password);

}
