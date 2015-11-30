package com.springcodicefiscale.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.springcodicefiscale.database.DbManager;
import com.springcodicefiscale.form.User;

@Controller
public class FormController {
	
	private static final Logger logger = LoggerFactory
			.getLogger(FormController.class);

	@RequestMapping(value = "/form", method = RequestMethod.GET)
	public ModelAndView getSecondPage(Model model) {
		
		
		
		DbManager db = new DbManager();
		List<String> regionList = new ArrayList<String>();
		List<String> sexList= new ArrayList<String>(2);
		sexList.add("maschio");
		sexList.add("femmina");
		regionList = db.getRegionList();

		User user = new User();
		model.addAttribute("user", user);
		model.addAttribute("regionList", regionList);
		model.addAttribute("sexList", sexList);
		return new ModelAndView("form", "model", model);
	}

	@RequestMapping(value = "/readProvince", method = RequestMethod.GET)
	public @ResponseBody
	List<String> citiesForState(
			@RequestParam(value = "stateName", required = true) String region) {
		logger.debug("finding cities for state " + region);
		DbManager db = new DbManager();
		return db.getProvinceList(region);
	}

	@RequestMapping(value = "/readCountry", method = RequestMethod.GET)
	public @ResponseBody
	List<String> citiesForCountry(
			@RequestParam(value = "stateName", required = true) String province) {
		logger.debug("finding cities for state " + province);
		DbManager db = new DbManager();
		System.out.println(db.getCountryList(province).size());
		return db.getCountryList(province);
	}

	@RequestMapping(value = "/invia", method = RequestMethod.POST)
	public ModelAndView getResultPage(ModelMap model, @ModelAttribute("user") @Valid User user, BindingResult error) {

		if (error.hasErrors()) {
			return new ModelAndView("form", "model", model);
		}

		model.addAttribute("name", user.getName());
		model.addAttribute("surname", user.getSurname());
		model.addAttribute("day", user.getDay());
		model.addAttribute("month", user.getMonth());
		model.addAttribute("year", user.getYear());
		model.addAttribute("region", user.getRegion());
		model.addAttribute("province", user.getProvince());
		model.addAttribute("country", user.getCountry());
		model.addAttribute("sex", user.getSex());
		return new ModelAndView("results", "model", model);
	}
}
