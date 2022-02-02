package com.example.hotel.repo;

import org.springframework.data.repository.CrudRepository;

import com.example.hotel.entity.Rooms;

public interface RoomsRepository extends CrudRepository < Rooms, Integer> {

}
