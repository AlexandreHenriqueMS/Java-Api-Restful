package com.javaweb.javaweb.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.javaweb.javaweb.entities.User;
import com.javaweb.javaweb.service.UserService;

@RestController
@RequestMapping(value = "/users")
public class UserController {

	@Autowired
	private UserService service;

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<User>> findAll() {
		List<User> objs = service.findAll();
		return ResponseEntity.ok().body(objs);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<User> findById(@PathVariable Long id) {
		User obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}

	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<User> insert(@RequestBody User obj) {
		obj = service.insert(obj);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId()).toUri();
		return ResponseEntity.created(uri).body(obj);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Void> delete(@PathVariable Long id) {
		service.delete(id);
		return ResponseEntity.noContent().build();
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	public ResponseEntity<User> update(@PathVariable Long id, @RequestBody User obj) {
		obj = service.update(id, obj);
		return ResponseEntity.ok().body(obj);
	}
}
