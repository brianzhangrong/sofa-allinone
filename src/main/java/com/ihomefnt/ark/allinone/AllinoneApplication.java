package com.ihomefnt.ark.allinone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
@ComponentScan("com.ihomefnt.ark")
public class AllinoneApplication {

	public static void main(String[] args) {
//		new Demo1Application().run(args);
//	    new com.ihomefnt.ark.demo.Demo1Service();
		SpringApplication.run(AllinoneApplication.class, args);

//		SofaArkBootstrap.launch(args);
	}

}

