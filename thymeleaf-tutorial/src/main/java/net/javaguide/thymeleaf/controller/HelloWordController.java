/**
 * 
 */
package net.javaguide.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloWordController{
	
	//handler   method to handl;e  /hello world request
	//http:localhost:8080/hello-world
	@GetMapping("/hello-world")
	public String  helloWorld(Model model) {
		
		model.addAttribute("message","hello  wordl");
		return "hello-world";
		
	
	}

}
