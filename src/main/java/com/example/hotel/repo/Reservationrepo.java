package com.example.hotel.repo;

import org.springframework.data.repository.CrudRepository;

import com.example.hotel.entity.Reservation;




public interface  Reservationrepo  extends CrudRepository <Reservation, Integer>{

}
