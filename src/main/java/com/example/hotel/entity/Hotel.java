package com.example.hotel.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "hotel")
public class Hotel {

	@Id
	private Integer hotel_id;
	private String hotel_name;
	private String location;
	private Integer id;

	@OneToMany(targetEntity = customer.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "id", referencedColumnName = "id")
	private List<customer> cuss;
	
	@OneToMany(targetEntity = Rooms.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "hotel_id", referencedColumnName = "hotel_id")
	private List<Rooms> room;

	public List<Rooms> getRoom() {
		return room;
	}

	public void setRoom(List<Rooms> room) {
		this.room = room;
	}

	public List<customer> getCuss() {
		return cuss;
	}

	public void setCuss(List<customer> cuss) {
		this.cuss = cuss;
	}

	public Integer getHotel_id() {
		return hotel_id;
	}

	public void setHotel_id(Integer hotel_id) {
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

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

}
