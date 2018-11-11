package com.teamtter.demo.propertiesinjection.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.teamtter.demo.propertiesinjection.dto.MyPropertiesMagic;

@Controller
public class MagicPropertiesController {
	
	@Autowired
	private MyPropertiesMagic properties;
	
	MagicPropertiesController() {
	}

	@GetMapping("/magicproperties")
	public String listproperties(Model model) {
		model.addAttribute("port", properties.getPort());
		model.addAttribute("var1", properties.getVar1());
		model.addAttribute("var2", properties.getVar2());
		
		return "magicproperties";
	}

}