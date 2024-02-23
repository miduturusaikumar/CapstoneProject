package com.ExampleProject.Fat.Payload;



import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class TechnicianDTO {
	
   private int id;
   private String firstname;
   private String secondname;
   private String email;
   private long mobilenumber;
   private String password;
   private long aadharnumber;
   private String description;
   
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getFirstname() {
	return firstname;
}
public void setFirstname(String firstname) {
	this.firstname = firstname;
}
public String getSecondname() {
	return secondname;
}
public void setSecondname(String secondname) {
	this.secondname = secondname;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public long getMobilenumber() {
	return mobilenumber;
}
public void setMobilenumber(long mobilenumber) {
	this.mobilenumber = mobilenumber;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}

public long getAadharnumber() {
	return aadharnumber;
}
public void setAadharnumber(long aadharnumber) {
	this.aadharnumber = aadharnumber;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
	
   
}
