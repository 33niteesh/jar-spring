package com.example.tpmgDemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Controller {
	@GetMapping("/{name}")
	public String getName(@PathVariable String name) {
		return "hello, "+name;
	}

}
