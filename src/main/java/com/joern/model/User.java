package com.joern.model;

import javax.persistence.*;

@Entity
@Table(name = "users") // Note! you can't use 'user' (without s) as table name in hibernate
public class User {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id")
    private long id;

	@Column(name = "name")
	private String name;


	// Required by Hibernate.
	private User() {}

	public static User newUser(){
		return new User();
	}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}