package com.ExampleProject.Fat.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name="Customers")
public class CustomerEntity {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
    
    @Column(name="firstname")
    private String firstname;
    
    @Column(name="secondtname")
    private String secondname;
    
    @Column(name="email",unique = true,nullable = false)
    private String email;
    
    @Column(name="mobile_number",length=10,unique = true,nullable = false)
    private long mobilenumber;
    
    @Column(name="aadhar_number",length=12,unique = true,nullable = false)
    private long aadharnumber;
    
    @Column(name="city",nullable = false)
    private String city;
    
    @Column(name="state",nullable = false)
    private String state;
    
    @Column(name="pincode",nullable = false)
    private long pincode;
    
    
    @Column(name="password",nullable = false)
    private String password;


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getFirstname() {
		return firstname;
	}


	public void setFirst_name(String firstname) {
		this.firstname = firstname;
	}


	public String getSecondname() {
		return secondname;
	}


	public void setSecond_name(String secondname) {
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


	public void setMobile_number(long mobilenumber) {
		this.mobilenumber = mobilenumber;
	}


	public long getAadharnumber() {
		return aadharnumber;
	}


	public void setAadhar_number(long aadharnumber) {
		this.aadharnumber = aadharnumber;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public long getPincode() {
		return pincode;
	}


	public void setPincode(long pincode) {
		this.pincode = pincode;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}
    
    
}
