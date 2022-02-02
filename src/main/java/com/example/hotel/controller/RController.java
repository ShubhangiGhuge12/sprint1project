package com.example.hotel.controller;


//import java.sql.Date;
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

	public class RController {

		@Autowired

		private Reservationrepo Reservationrepo;

		@GetMapping("/demo10/h")
		public String hello() {
			return "revmanage";
		}

		@GetMapping(path ="/demo10/home")
		public String homepage() {
			return "revmember";
		}

		@GetMapping(path ="/demo10/add")

		public String addNewUser(@RequestParam int reservation_id, String r_date, @RequestParam int total_amount,@RequestParam int hotel_id,@RequestParam int user_id) {

			System.out.println("inside add" +reservation_id+ " "+ r_date+ " " +total_amount+""+hotel_id+ "" +user_id);

			Reservation obj = new Reservation();
			obj.setReservation_id(reservation_id);
			obj.setR_date(r_date);
			obj.setTotal_amount(total_amount);
			obj.setHotel_id(hotel_id);
			obj.setUser_id(user_id);
			Reservationrepo.save(obj);
			return "revhome";
		}

		@GetMapping(path = "/demo10/all")
		public String getAllUsers() {
			return "revfetch";

		}
	
		@GetMapping(path = "/demo10/isExist")
		public @ResponseBody boolean isExist() {

			
			System.out.println("inside all");
			return Reservationrepo.existsById(1);
		}

		@GetMapping(path="/demo10/delete")
		public String delPage() {
			return "revdel";
		}

		@GetMapping(path = "/demo10/deleted")
		public String delete(@RequestParam int reservation_id) {
			System.out.println("inside all");
		Reservationrepo.deleteById(reservation_id);
			return "revhome";

		}

		@GetMapping(path = "/demo10/updated")
		public String updated(@RequestParam int reservation_id, String r_date, @RequestParam int total_amount,@RequestParam int hotel_id,@RequestParam int user_id) {

		
			Reservation obj = new Reservation();
			obj.setReservation_id(reservation_id);
			obj.setR_date(r_date);
			obj.setTotal_amount(total_amount);
			obj.setHotel_id(hotel_id);
			obj.setUser_id(user_id);

			Reservationrepo.save(obj);


			return "revhome";

		}

		@GetMapping(path = "/demo10/update")
		
		public String uppage() {
			return "revupdating";
		}

	

}
