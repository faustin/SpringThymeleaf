/**
 * 
 */
package net.javaguide.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import net.javaguide.thymeleaf.model.User;
import org.springframework.web.bind.annotation.RequestParam;


/**
 * 
 */
@Controller
public class UserController {
	//Method  to handle  variable  expression
	@GetMapping("/variable-expression")
	public String variableExpression(Model model) {
		User user =new User("Faustin", "fmaniragena@gmail.com", "Developer ", "M");
		model.addAttribute("user", user);
		
		return  "variable-expression";
	}
	//Method  to handle  selection expression
	@GetMapping("/selection-expression")
	public String  selectExpression(Model model) {
		User user =new User("Mariam", "mariam@gmail.com", "Developer ", "M");
		
		model.addAttribute("user", user);
		
		return  "selection-expression";
	}
	//Method to handle   message  expression request 
	
	@GetMapping("/message-expression")
	public String messageExpression(Model model) {
		
		return "message-expression";
	}
		
	//Method to handle  the link expression
	
	@GetMapping("/link-expression")
	public  String  linkExpression(Model model ) {
		model.addAttribute("id", 1);
		
		return  "link-expression";
	}
	
	
	

}
