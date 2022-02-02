package com.example.hotel.repo;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.example.hotel.dto.HotelCustomer;
import com.example.hotel.dto.HotelRooms;
import com.example.hotel.entity.Hotel;

	
	public interface HotelRepository extends CrudRepository < Hotel, Integer>{
		
		@Query("select new com.example.hotel.dto.HotelCustomer(h.id,h.hotel_id,h.hotel_name,h.location,c.name,c.email,c.country) from Hotel h join h.cuss c where h.id=:a"  )
		public Iterable<HotelCustomer> getJoinCP(@Param("a") Integer a);
		
		
		@Query("select new com.example.hotel.dto.HotelRooms(h.id,h.hotel_id,h.hotel_name,h.location,c.r_id,c.fname,c.lname) from Hotel h join h.room c where h.hotel_id=:b"  )
		public Iterable<HotelRooms> getJoinCPP(@Param("b") Integer b);

	
		
		
		
	
	
	}

	
	
