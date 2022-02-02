package com.example.hotel.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity // This tells Hibernate to make a table out of this class
public class customer {

	@Id
	private Integer id;
	private String name;
	 private String email;
	 private String country;
	 
	 

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Integer getId() {
		 
		 return id;
	 }
	 
	 public void setId(Integer id) {
		 
		 
		 this.id = id;
	}
	
	public String getName() {
		
		return name;
	}
	
	public void setName(String name) {
		
		this.name = name;
	}
	
	
	public String getEmail() {
		
		return email;
	}
	
	public void setEmail(String email) {
		this.email =email;
	}
}

