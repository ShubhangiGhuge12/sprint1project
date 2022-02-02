package com.example.hotel.entity;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Food {
	
	@Id
	

	 private Integer Food_id;
	
	private  String Food_menu;
     private Integer Food_amt;
     private String Food_review;
    
	public Integer getFood_id() {
		return Food_id;
	}
	public void setFood_id(Integer food_id) {
		Food_id = food_id;
	}
	public String getFood_menu() {
		return Food_menu;
	}
	public void setFood_menu(String food_menu) {
		Food_menu = food_menu;
	}
	public Integer getFood_amt() {
		return Food_amt;
	}
	public void setFood_amt(Integer food_amt) {
		Food_amt = food_amt;
	}
	public String getFood_review() {
		return Food_review;
	}
	public void setFood_review(String food_review) {
		Food_review = food_review;
	}
	
	
}
