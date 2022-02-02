package com.example.hotel.repo;

import org.springframework.data.repository.CrudRepository;

import com.example.hotel.entity.customer;



public interface customerRepository extends CrudRepository <customer, Integer>{
	
}