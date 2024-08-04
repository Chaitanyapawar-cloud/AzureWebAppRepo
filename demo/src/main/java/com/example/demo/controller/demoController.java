package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/javaApp")
public class demoController {
	
	@GetMapping("/getMsg")
	public ResponseEntity<String> getMsg(){
		ResponseEntity<String> resp = new ResponseEntity<>("Hello, I am Chaitanya ", HttpStatus.OK);
		return resp;
	}

}
