package fr.orsys.security.controllers;

import java.security.Principal;

import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@GetMapping("/user")
	public String user(Principal principal) {
		// one way of getting user name
		System.out.println(principal.getName());
		return "user";
	}
	
	@GetMapping("/admin")
	public String admin() {
		// another way of getting user name
		SecurityContext securityContext = SecurityContextHolder.getContext();
		System.out.println(securityContext.getAuthentication().getName());
		return "admin";
	}
}
