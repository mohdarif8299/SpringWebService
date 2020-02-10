package com.com.books.bookify;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.com.books.bookify.storage.StorageService;

@SpringBootApplication
@EnableConfigurationProperties({
    StorageService.class
})
public class SpringBookifyApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBookifyApplication.class, args);
	}

}
