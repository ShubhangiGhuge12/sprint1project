package com.example.hotel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.hotel.entity.Booking;
import com.example.hotel.repo.BookingRepository;
@Controller
public class BookingController {
	
	@Autowired
private BookingRepository bookrepo;
	
	@GetMapping("/demo3/h")
	public String hello1() {
		return "bookingmanage";
	}
	

	
	@GetMapping("/demo3/home")
	public String homepage1() {
		return "bmember";
	}
	
	
@GetMapping(path="/demo3/add") // Map ONLY POST Requests
public String addNewUser1 (@RequestParam int b_id,@RequestParam int period) {
	
Booking obj = new Booking();
	
	obj.setB_id(b_id);
	obj.setPeriod(period);
	
	bookrepo.save(obj);

	return "bhome";
	
}

@GetMapping(path="/demo3/all")
public String getAllUsers1() {
	return "bfetch";


}



@GetMapping(path="/demo3/isExist")
public @ResponseBody boolean isExist1() {
	
	// This returns a JSON or XML with the users
System.out.println("inside all");
return bookrepo.existsById(101);
}

@GetMapping(path="/demo3/delete")
public String delPage1() {
	return "bdel";
}
@GetMapping(path = "/demo3/deleted")
public  String delete1(@RequestParam int b_id) {
	System.out.println("inside all");
	bookrepo.deleteById(b_id);
	return "bhome";
}



@GetMapping(path = "/demo3/updated")
public String updated1(@RequestParam int b_id,@RequestParam int period) {



	Booking obj = new Booking();
	
	obj.setB_id(b_id);
	obj.setPeriod(period);
	
	bookrepo.save(obj);

	return "bhome";


}
@GetMapping(path = "/demo3/update")

public String uppage1() {
return "bupdating";


}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
