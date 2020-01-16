package com.congreso.springboot.apirest.repository;

import org.springframework.data.repository.CrudRepository;

import com.congreso.springboot.apirest.model.OrderProduct;
import com.congreso.springboot.apirest.model.OrderProductPK;

public interface OrderProductRepository extends CrudRepository<OrderProduct, OrderProductPK> {
}
