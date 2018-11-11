package com.teamtter.demo.propertiesinjection;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.teamtter.demo.propertiesinjection.dto.MyPropertiesConstructor;

@SpringBootApplication
public class PropertiesinjectionApplication {

	@Value("${server.port}")
	private String port;
	
	@Value("${var1}")
	private String var1;
	
	@Value("${var2}")
	private String var2;
	
	
//	@Bean
//	public MyPropertiesMagic propertiesMagic() {
//		return new MyPropertiesMagic();
//	}
	
	@Bean
    public MyPropertiesConstructor properties() {
		return new MyPropertiesConstructor(port, var1, var2);
	}
	
	public static void main(String[] args) {
		SpringApplication.run(PropertiesinjectionApplication.class, args);
	}
}
