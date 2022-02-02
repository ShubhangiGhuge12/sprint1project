package com.example.hotel.dto;

public class HotelCustomer {

	int id;
	int hotel_id;
	String hotel_name;
	String location;
	String name;
	String email;
	String country;

	public HotelCustomer(int id, int hotel_id, String hotel_name, String location, String name, String email,
			String country) {
		super();
		this.id = id;
		this.hotel_id = hotel_id;
		this.hotel_name = hotel_name;
		this.location = location;
		this.name = name;
		this.email = email;
		this.country = country;
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
		this.email = email;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

}
