package com.example.InventoryManagement1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("com.example.InventoryManagement1.model")
@EnableJpaRepositories("com.example.InventoryManagement1.repository")
public class InventoryManagement1Application {

	public static void main(String[] args) {
		SpringApplication.run(InventoryManagement1Application.class, args);
	}

}
