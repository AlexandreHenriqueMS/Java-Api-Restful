package com.javaweb.javaweb.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.javaweb.javaweb.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserController {

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<User> findAll() {
		User user = new User("Maria", "maria@gmail.com", "9999", "12345");
		return ResponseEntity.ok().body(user);
	}
}
