package com.app.repository;

import java.util.List;

import com.app.bean.User;

public class BillData {

	public List<User> getAllUsers() {
		// this layer can be connected to a database, i chose to stock users in a LIST
		return User.getAllUsers();
	}

	public User getUserById(int id) {
		// this layer can be connected to a database, i chose to stock users in a LIST
		List<User> allUsers = User.getAllUsers();
		User selectedUser = null;
		for (User user : allUsers) {
			if (user.getId() == id) {
				selectedUser = user;
			}
		}
		return selectedUser;
	}

}
