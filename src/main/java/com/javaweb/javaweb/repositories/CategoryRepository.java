package com.javaweb.javaweb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.javaweb.javaweb.entities.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

}
