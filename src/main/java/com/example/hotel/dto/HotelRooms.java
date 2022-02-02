package com.example.hotel.dto;

public class HotelRooms {
	
	int id;
	int hotel_id;
	String hotel_name;
	String location;
	int r_id;
	
	
	public HotelRooms(int id, int hotel_id, String hotel_name, String location, int r_id, String fname, String lname) {
		super();
		this.id = id;
		this.hotel_id = hotel_id;
		this.hotel_name = hotel_name;
		this.location = location;
		this.r_id = r_id;
		this.fname = fname;
		this.lname = lname;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getHotel_id() {
		return hotel_id;
	}
	public void setHotel_id(int hotel_id) {
		this.hotel_id = hotel_id;
	}
	public String getHotel_name() {
		return hotel_name;
	}
	public void setHotel_name(String hotel_name) {
		this.hotel_name = hotel_name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getR_id() {
		return r_id;
	}
	public void setR_id(int r_id) {
		this.r_id = r_id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	String fname;
	String lname;
	

}
