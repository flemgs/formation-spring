package fr.orsys.mvc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import fr.orsys.mvc.dto.User;
import fr.orsys.mvc.services.UserService;

@Controller
@RequestMapping("/inscription")
public class InscriptionController {

	@Autowired
	private UserService userService;
	
	@RequestMapping(method= RequestMethod.GET)
	public String inscriptionMethod(@RequestParam("login") String login,
									@RequestParam("password") String password,
									ModelMap model) {
		User user = new User();
		user.setLogin(login);
		user.setPassword(password);
		userService.add(user);
		return "loginPage";
	}
}
