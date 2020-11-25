package com.javaweb.javaweb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.javaweb.javaweb.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
