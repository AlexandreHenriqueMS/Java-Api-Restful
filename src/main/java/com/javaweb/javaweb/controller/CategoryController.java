package com.javaweb.javaweb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.javaweb.javaweb.entities.Category;
import com.javaweb.javaweb.service.CategoryService;

@RestController
@RequestMapping(value = "/Categories")
public class CategoryController {

	@Autowired
	private CategoryService service;

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<Category>> findAll() {
		List<Category> objs = service.findAll();
		return ResponseEntity.ok().body(objs);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<Category> findById(@PathVariable Long id) {
		Category obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}
