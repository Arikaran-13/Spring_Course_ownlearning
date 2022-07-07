package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class FirstSpringDemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext con = SpringApplication.run(FirstSpringDemoApplication.class, args);
		Home h = con.getBean(Home.class);
		Home h2 = con.getBean(Home.class);
		h.connect();
		h2.connect();
		}

}
