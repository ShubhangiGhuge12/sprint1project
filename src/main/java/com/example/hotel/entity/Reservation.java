package com.example.hotel.entity;

import java.sql.Date;

import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;

	@Entity 
	public class Reservation {
		@Id
		private int reservation_id;
		private String r_date;
		
		public String getR_date() {
			return r_date;
		}
		public void setR_date(String r_date) {
			this.r_date = r_date;
		}
		private int total_amount;
		 private int hotel_id;
		 private int  user_id;
		 
		 
		 
		public int getReservation_id() {
			return reservation_id;
		}
		public void setReservation_id(int reservation_id) {
			this.reservation_id = reservation_id;
		}
	
		public int getTotal_amount() {
			return total_amount;
		}
		public void setTotal_amount(int total_amount) {
			this.total_amount = total_amount;
		}
		public int getHotel_id() {
			return hotel_id;
		}
		public void setHotel_id(int hotel_id) {
			this.hotel_id = hotel_id;
		}
		public int getUser_id() {
			return user_id;
		}
		public void setUser_id(int user_id) {
			this.user_id = user_id;
		}
		 
		 
		 
		
}
