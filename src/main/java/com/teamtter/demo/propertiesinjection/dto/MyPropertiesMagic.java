package com.teamtter.demo.propertiesinjection.dto;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Getter;

@Component
@Getter
public class MyPropertiesMagic {

	@Value("${server.port}")
	private String port;
	
	@Value("${var1}")
	private String var1;
	
	@Value("${var2}")
	private String var2;
}
