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
@RequestMapping("/checkLogin")
public class CheckController {

	@Autowired
	private UserService userService;
	
	@RequestMapping(method=RequestMethod.GET)
	public String loginMethod(@RequestParam("login") String login,
							  @RequestParam("password") String password,
			                  ModelMap model) {
		User user = userService.findUserByLoginPassword(login, password);
		System.out.println("user => " + user);
		if(user == null) {
			return "errorPage";
		}
		model.addAttribute("loginUser", user.getLogin());
		return "homePage";
	}
}
