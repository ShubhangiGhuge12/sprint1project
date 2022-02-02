package com.example.hotel.repo;

import org.springframework.data.repository.CrudRepository;

import com.example.hotel.entity.Payment;

public interface PaymentRepository extends CrudRepository < Payment, Integer>{
}
