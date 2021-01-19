package com.ihomefnt.ark.allinone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
@SpringBootApplication
@ComponentScan("com.ihomefnt.ark")
public class AllinoneApplication {

	public static void main(String[] args) {
		SpringApplication.run(AllinoneApplication.class, args);
	}

}

