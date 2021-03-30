package com.ybg.blog.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class BlogControllerTest {
	
	@GetMapping("/test/hello")
	public String starttest() {
		return "<h1>테스트!</h1>";
	}
	
	
	

}
