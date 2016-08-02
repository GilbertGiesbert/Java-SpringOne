package com.joern.dao;

import com.joern.model.User;

import java.util.List;


public interface UserDao {

    public User create();
    public User read(long id);
    public boolean update(User user);
    public boolean delete(User user);

    public List<User>readAll();
}