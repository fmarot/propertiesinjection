package com.teamtter.demo.propertiesinjection.dto;

import lombok.Getter;

@Getter
public class MyPropertiesConstructor {
	
	private String port;
	private String var1;
	private String var2;
	
	public MyPropertiesConstructor(String port, String var1, String var2) {
		this.port = port;
		this.var1 = var1;
		this.var2 = var2;
	}
}
