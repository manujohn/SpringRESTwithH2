package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.EntitiyS;
import com.example.service.ServiceS;

@RestController
@RequestMapping("/user")
public class ControllerS {

	@Autowired
	ServiceS service;

	@PostMapping("/")
	public EntitiyS saveUser(@RequestBody EntitiyS user) {
		return service.saveUser(user);
	}

	@GetMapping("/{userid}")
	public EntitiyS getUser(@PathVariable("userid") int userid) {
		return service.getUser(userid);
	}
}