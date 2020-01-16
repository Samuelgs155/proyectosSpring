package com.congreso.springboot.apirest.repository;


import org.springframework.data.repository.CrudRepository;

import com.congreso.springboot.apirest.model.Order;

public interface OrderRepository extends CrudRepository<Order, Long> {
}
