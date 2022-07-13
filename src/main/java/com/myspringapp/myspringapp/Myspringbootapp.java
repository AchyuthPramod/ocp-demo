package com.myspringapp.myspringapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Myspringbootapp {
	@GetMapping("/")
	public String Welcome() {
		return "Hello World OCP";
	}

}
  