package com.example.problemdetail.iiiproblemdetail.controller;

import com.example.problemdetail.common.model.Message;
import java.time.LocalDateTime;
import java.util.regex.Pattern;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/*
	Ramanuj Das : 	https://www.youtube.com/watch?v=NNrgsdYNuEM
 */
@RestController
public class AppController {

	@GetMapping("/hi/{user}")
	public Message sayHi(@PathVariable String user){
		boolean isUserValidate = Pattern.matches("[a-zA-Z]+",user);
		if(!isUserValidate){
			throw new RuntimeException("user 명은 알파벳 대소문자만 허용됩니다");
		}
		return new Message(101, "Hey there, Spring boot 3 has Java 17 Support", LocalDateTime.now());
	}

}
