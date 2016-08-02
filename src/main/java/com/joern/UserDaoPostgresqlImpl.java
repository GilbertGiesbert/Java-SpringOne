package com.joern;

import javax.sql.DataSource;
import java.util.List;

/**
 * Created by Geheim on 29.07.2016.
 */
public class UserDaoPostgresqlImpl implements UserDao {


    private DataSource dataSource ;

    public DataSource getDataSource() {
        return dataSource;
    }

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public User create() {
        return null;
    }

    @Override
    public User read(long id) {
        return null;
    }

    @Override
    public boolean update(User user) {
        return false;
    }

    @Override
    public boolean delete(User user) {
        return false;
    }

    @Override
    public List<User> readAll() {
        return null;
    }
}