package com.dxc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	@GetMapping("/{name}/{age}")
	public String getMessage(@PathVariable("name") String name,@PathVariable("age") int age) {
		return "Hello "+ name + " You are "+age+" years old.";
	}
}
