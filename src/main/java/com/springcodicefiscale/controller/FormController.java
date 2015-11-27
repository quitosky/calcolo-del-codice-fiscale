package com.springcodicefiscale.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import springcodicefiscale.form.User;

@Controller
public class FormController {

	@RequestMapping(value = "/form", method = RequestMethod.GET)
	public ModelAndView getSecondPage(Model model) {
		List<String> regionList=new ArrayList<String>();
		regionList.add("regioni");
		User user = new User();
		model.addAttribute("user", user);
		model.addAttribute("regionList", regionList);
		return new ModelAndView("form", "model", model);
	}

	@RequestMapping(value = "/invia", method = RequestMethod.POST)
	public ModelAndView getResultPage(ModelMap model, @ModelAttribute("user") @Valid User user, BindingResult error) {
		
		if(error.hasErrors()){
			return new ModelAndView("form","model",model);
		}
		
		model.addAttribute("name", user.getName());
		model.addAttribute("surname", user.getSurname());
		model.addAttribute("day", user.getDay());
		model.addAttribute("month", user.getMonth());
		model.addAttribute("year", user.getYear());

		return new ModelAndView("results", "model", model);
	}
}
