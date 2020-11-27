package com.javaweb.javaweb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.javaweb.javaweb.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
