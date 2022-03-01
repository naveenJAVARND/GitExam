package com.GitExam;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {
    
	
	
	@GetMapping("/")
	String helloworld()
	{
		String str="This is Main";
		return str;
	}
	
	
}
