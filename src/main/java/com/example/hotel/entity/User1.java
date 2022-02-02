package com.example.hotel.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User1 {
	
		@Id

		private int user_id;
		private String uname;
		private String email;
		private String u_address;
		private String u_mobile;
		private int hotel_id;
		
		public int getUser_id() {
			return user_id;
		}
		public void setUser_id(int user_id) {
			this.user_id = user_id;
		}
		public String getUname() {
			return uname;
		}
		public void setUname(String uname) {
			this.uname = uname;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getU_address() {
			return u_address;
		}
		public void setU_address(String u_address) {
			this.u_address = u_address;
		}
		
		
		public String getU_mobile() {
			return u_mobile;
		}
		
		public void setU_mobile(String u_mobile) {
			// TODO Auto-generated method stub
			this.u_mobile = u_mobile;
		}
		
		public int getHotel_id() {
			return hotel_id;
		}
		public void setHotel_id(int hotel_id) {
			this.hotel_id = hotel_id;
		}

		

	}






