package com.congreso.springboot.apirest.repository;

import org.springframework.data.repository.CrudRepository;

import com.congreso.springboot.apirest.model.Product;

public interface ProductRepository extends CrudRepository<Product, Long> {
}
