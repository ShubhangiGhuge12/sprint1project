package com.example.hotel.repo;

import org.springframework.data.repository.CrudRepository;

import com.example.hotel.entity.Booking;


public interface BookingRepository extends CrudRepository < Booking, Integer> {

}