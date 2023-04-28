package com.example.demo;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MyRestController {
    // REST endpoints will be defined here
	@PostMapping("/post")
	public void handlePostRequest(@RequestBody String requestBody) {
	    // Request body will be processed here
	    System.out.println(requestBody);
	}
}
