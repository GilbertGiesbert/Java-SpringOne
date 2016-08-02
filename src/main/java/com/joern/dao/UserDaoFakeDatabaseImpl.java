package com.joern.dao;

import com.joern.database.FakeDatabase;
import com.joern.model.User;

import java.util.List;


public class UserDaoFakeDatabaseImpl implements UserDao{

	private FakeDatabase database;

	public UserDaoFakeDatabaseImpl(){
		database = new FakeDatabase();
	}

	public User create() {
		return database.create();
	}

	public User read(long id) {
		return database.read(id);
	}

	public boolean update(User user) {
		return database.update(user);
	}

	public boolean delete(User user) {
		return database.delete(user);
	}

	public List<User> readAll() {
		return database.readAll();
	}
}
