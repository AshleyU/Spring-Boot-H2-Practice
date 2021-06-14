package com.example.h2zoo;

import com.example.h2zoo.repository.ReptileRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class H2ZooApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext configurableApplicationContext =
				SpringApplication.run(H2ZooApplication.class, args);
		ReptileRepository reptileRepository =
				configurableApplicationContext.getBean(ReptileRepository.class);
	}

}
