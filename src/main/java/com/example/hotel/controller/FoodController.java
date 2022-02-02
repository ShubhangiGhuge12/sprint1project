package com.example.hotel.controller;

import java.util.Optional;

import org.apache.tomcat.jni.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.hotel.entity.*;
import com.example.hotel.repo.*;
@Controller

public class FoodController {

	@Autowired

	private FoodRepository Foodrepo;

	@GetMapping("/demo1/h")
	public String hello() {
		return "Foodmanage";
	}

	@GetMapping(path = "/demo1/home")
	public String homepage() {
		return "Fmember";
	}

	@GetMapping(path = "/demo1/add")

	public String addNewUser(@RequestParam int Food_id,String Food_menu, @RequestParam int Food_amt, String Food_review
			) {

		System.out.println("inside add" + Food_id + " "+ Food_menu + " " + Food_amt + "" + Food_review);

		Food obj = new Food();
		obj.setFood_id(Food_id);
		obj.setFood_menu(Food_menu);
		obj.setFood_amt(Food_amt);
		obj.setFood_review(Food_review);
		
		Foodrepo.save(obj);

		return "Fhome";
	}

	@GetMapping(path = "/demo1/all")
	public String getAllUsers() {
		return "Foodfetch";

	}


	@GetMapping(path = "/demo1/isExist")
	public @ResponseBody boolean isExist() {

		// This returns a JSON or XML with the users
		System.out.println("inside all");
		return Foodrepo.existsById(1);
	}

	@GetMapping("/demo1/delete")
	public String delPage() {
		return "Fdel";
	}

	@GetMapping(path = "/demo1/deleted")
	public String delete(@RequestParam Integer Food_id) {
		System.out.println("inside all");
		Foodrepo.deleteById(Food_id);
		return "Fhome";

	}

	@GetMapping(path = "/demo1/updated")
	public String updated(@RequestParam int Food_id, String Food_menu, @RequestParam int Food_amt, String Food_review) {

		// int ids = Integer.parseInt(id);

		Food obj = new Food();
		obj.setFood_id(Food_id);
		obj.setFood_menu(Food_menu);
		obj.setFood_amt(Food_amt);
		obj.setFood_review(Food_review);
		Foodrepo.save(obj);

		return "Fhome";

	}

	@GetMapping(path = "/demo1/update")
	
	public String uppage() {
		return "Fupdating";
	}

}

