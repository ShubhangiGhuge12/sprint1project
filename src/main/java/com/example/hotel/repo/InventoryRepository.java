package com.example.hotel.repo;

import org.springframework.data.repository.CrudRepository;

import com.example.hotel.entity.Inventory;


public interface InventoryRepository extends CrudRepository < Inventory, Integer>{

}