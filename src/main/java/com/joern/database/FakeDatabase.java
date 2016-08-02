package com.joern.database;

import com.joern.model.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class FakeDatabase {

	private long idCount;
	private HashMap<Long, User> database;

	public FakeDatabase(){
		database = new HashMap<Long, User>();
	}


	public User create() {

		long id = idCount++;
		User user = new User();
		user.setId(id);
		database.put(id, user);
		return user;
	}

	public User read(long id) {
		return database.get(id);
	}

	public boolean update(User user) {

		if(database.containsKey(user.getId())){
			database.put(user.getId(), user);
			return true;
		}
		else{
			return false;
		}
	}

	public boolean delete(User user) {

		database.remove(user.getId());
		return database.containsKey(user.getId());
	}

	public List<User> readAll() {
		return new ArrayList(database.values());
	}
}