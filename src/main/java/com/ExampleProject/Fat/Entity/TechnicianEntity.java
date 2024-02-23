package com.ExampleProject.Fat.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor


@Entity
@Table(name="Technicians")
public class TechnicianEntity {
      
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
     private int id;
	 
	 @ManyToOne(fetch = FetchType.LAZY)
	 @JoinColumn(name="service_id")
	 private Services services_id;
	 
	 @Column(name="firstname",nullable = false)
	 private String firstname;
	    
	 @Column(name="secondtname")
	 private String secondname;
	    
	 @Column(name="email",unique = true,nullable = false)
	 private String email;
	    
	 @Column(name="mobilenumber",length=10,unique = true,nullable = false)
	 private long mobilenumber;
	    
	 @Column(name="aadharnumber",length=12,unique = true,nullable = false)
	 private long aadharnumber;
	    
	 @Column(name="description")
	 private String description;
	 
	 @Column(name="password")
	 private String password;

	 
	 
	 
	public TechnicianEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TechnicianEntity(int id, Services services_id, String firstname, String secondname, String email,
			long mobilenumber, long aadharnumber, String description, String password) {
		super();
		this.id = id;
		this.services_id = services_id;
		this.firstname = firstname;
		this.secondname = secondname;
		this.email = email;
		this.mobilenumber = mobilenumber;
		this.aadharnumber = aadharnumber;
		this.description = description;
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Services getServices_id() {
		return services_id;
	}

	public void setServices_id(Services services_id) {
		this.services_id = services_id;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
