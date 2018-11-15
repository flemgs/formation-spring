package fr.orsys.mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/formInscription")
public class FormInscriptionController {

	@RequestMapping(method= RequestMethod.GET)
	public String inscriptionMethod(ModelMap model) {
		return "inscription";
	}
}

