package com.djvantsuman.fishCompany.entity;

import javax.persistence.*;

@Entity
public class Customer {
	
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    private String firstName;
    private String lastName;
    private String password;
    
	public int getId() {
		return id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPussvord() {
		return password;
	}
	public void setPussvord(String password) {
		this.password = password;
	}
    
}
