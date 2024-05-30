package com.gm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("com.gm.domain")
public class HolaSpringApplication {
 
	public static void main(String[] args) {
		SpringApplication.run(HolaSpringApplication.class, args);
	}

}
