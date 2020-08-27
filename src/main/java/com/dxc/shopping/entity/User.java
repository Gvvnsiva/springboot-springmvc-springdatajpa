package com.dxc.shopping.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity(name="user")
public class User {
	@Id
 private String firstname;
 private String lastname;
 private String username;
 private String password;
 private String email;
 private String mobileno;
 private String roles;
public User() {
	super();
	// TODO Auto-generated constructor stub
}
public User(String firstname, String lastname, String username, String password, String email, String mobileno,
		String roles) {
	super();
	this.firstname = firstname;
	this.lastname = lastname;
	this.username = username;
	this.password = password;
	this.email = email;
	this.mobileno = mobileno;
	this.roles = roles;
}
public String getFirstname() {
	return firstname;
}
public void setFirstname(String firstname) {
	this.firstname = firstname;
}
public String getLastname() {
	return lastname;
}
public void setLastname(String lastname) {
	this.lastname = lastname;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getMobileno() {
	return mobileno;
}
public void setMobileno(String mobileno) {
	this.mobileno = mobileno;
}
public String getRoles() {
	return roles;
}
public void setRoles(String roles) {
	this.roles = roles;
}
@Override
public String toString() {
	return "User [firstname=" + firstname + ", lastname=" + lastname + ", username=" + username + ", password="
			+ password + ", email=" + email + ", mobileno=" + mobileno + ", roles=" + roles + "]";
}

 
 
}
