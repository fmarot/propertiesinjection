package com.teamtter.demo.propertiesinjection.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.teamtter.demo.propertiesinjection.dto.MyPropertiesConstructor;

@Controller
public class ConstructorPropertiesController {

	private MyPropertiesConstructor properties;
	
	public ConstructorPropertiesController(MyPropertiesConstructor properties) {
		this.properties = properties;
	}

	@GetMapping("/constructorproperties")
	public String listproperties(Model model) {
		model.addAttribute("port", properties.getPort());
		model.addAttribute("var1", properties.getVar1());
		model.addAttribute("var2", properties.getVar2());
		
		return "constructorproperties";
	}

}