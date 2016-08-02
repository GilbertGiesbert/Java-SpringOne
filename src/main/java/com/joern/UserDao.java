package com.joern;

import java.util.List;

/**
 * Created by Geheim on 29.07.2016.
 */
public interface UserDao {

    public User create();
    public User read(long id);
    public boolean update(User user);
    public boolean delete(User user);

    public List<User>readAll();
}