package com.joern.dao;

import com.joern.model.User;

import javax.sql.DataSource;
import java.util.List;


public class UserDaoPostgresqlImpl implements UserDao {


    private DataSource dataSource ;

    public DataSource getDataSource() {
        return dataSource;
    }

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

	public User create() {
		return null;  //To change body of implemented methods use File | Settings | File Templates.
	}

	public User read(long id) {
		return null;  //To change body of implemented methods use File | Settings | File Templates.
	}

	public boolean update(User user) {
		return false;  //To change body of implemented methods use File | Settings | File Templates.
	}

	public boolean delete(User user) {
		return false;  //To change body of implemented methods use File | Settings | File Templates.
	}

	public List<User> readAll() {
		return null;  //To change body of implemented methods use File | Settings | File Templates.
	}
}