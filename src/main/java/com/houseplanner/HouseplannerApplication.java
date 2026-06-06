package com.houseplanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(
		exclude = {DataSourceAutoConfiguration.class}
)
public class HouseplannerApplication {

	public static void main(String[] args) {
		SpringApplication.run(HouseplannerApplication.class, args);
	}

}
