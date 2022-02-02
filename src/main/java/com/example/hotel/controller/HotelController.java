package com.example.hotel.controller;

import org.apache.tomcat.jni.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.hotel.dto.HotelCustomer;
import com.example.hotel.dto.HotelRooms;
import com.example.hotel.entity.*;
import com.example.hotel.repo.*;

@Controller // This means that this class is a Controller

public class HotelController {

	@Autowired

	private HotelRepository hotrepo;

	@GetMapping("/demo/p")
	public String joindata() {
		return "join";

	}

	@GetMapping(path = "/demo/pp")

	public String run(@RequestParam Integer id) {
		Hotel obj = new Hotel();
		obj.setId(id);
		hotrepo.getJoinCP(id);
		return "joinfetch";
	}

	@GetMapping("/demo/p1")
	public String joindata1() {
		return "joinn";

	}

	@GetMapping(path = "/demo/pp1")

	public String run1(@RequestParam Integer hotel_id) {
		Hotel obj = new Hotel();
		obj.setId(hotel_id);
		hotrepo.getJoinCPP(hotel_id);
		return "jf";
	}

	@GetMapping("/demo/h")
	public String hello() {
		return "hotelmanage";
	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login() {
		return "Login";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String welcomePage(ModelMap model, @RequestParam String username, @RequestParam String password) {
		if (username.equals("admin") && password.equals("root")) {
			model.put("username", username);
			return "member";
		}
		model.put("errorMsg", "Please provide the correct username and password");
		return "Login";
	}

	@GetMapping("/demo/home")
	public String homepage() {
		return "member";
	}

	@GetMapping(path = "/demo/add")
	public String addNewUser(String hotel_name, String location, @RequestParam int hotel_id, @RequestParam int id) {

		System.out.println("inside add" + hotel_name + " " + location + " " + hotel_id + " " + id);

		Hotel obj = new Hotel();
		obj.setHotel_name(hotel_name);
		obj.setLocation(location);
		obj.setHotel_id(hotel_id);
		obj.setId(id);
		hotrepo.save(obj);

		return "home";
	}

	@GetMapping(path = "/demo/all")
	public String getAllUsers() {
		return "fetch";

	}

	@GetMapping(path = "/demo/isExist")
	public @ResponseBody boolean isExist() {

		System.out.println("inside all");
		return hotrepo.existsById(101);
	}

	@GetMapping("/demo/delete")
	public String delPage() {
		return "del";
	}

	@GetMapping(path = "/demo/deleted")
	public String delete(@RequestParam int hotel_id) {
		System.out.println("inside all");
		hotrepo.deleteById(hotel_id);
		return "home";
	}

	@GetMapping(path = "/demo/updated")
	public String updated(@RequestParam int hotel_id, @RequestParam int id, String hotel_name, String location) {
		Hotel obj = new Hotel();
		obj.setHotel_id(hotel_id);
		obj.setId(id);
		obj.setHotel_name(hotel_name);
		obj.setLocation(location);
		hotrepo.save(obj);

		return "home";
	}

	@GetMapping(path = "/demo/update")

	public String uppage() {
		return "updating";

	}

}
