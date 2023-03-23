package com.jeproductions.commonfunlibapi;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jeproductions.restservice.Generator;
import com.jeproductions.restservice.generatorrr;

@RestController
public class GeneratorController {


	Generator gen = new Generator();
	String password = "";

	@GetMapping("/generatePassword")
	public generatorrr generatePassword(@RequestParam("length") int length) {
       
		password = gen.generatePassword(length);
		
		return new generatorrr(password);
	}	
}
