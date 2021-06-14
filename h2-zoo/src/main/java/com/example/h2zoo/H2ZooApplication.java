package com.example.h2zoo;

import com.example.h2zoo.model.Mammal;
import com.example.h2zoo.model.Reptile;
import com.example.h2zoo.repository.MammalRepository;
import com.example.h2zoo.repository.ReptileRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.List;

@SpringBootApplication
public class H2ZooApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext configurableApplicationContext =
				SpringApplication.run(H2ZooApplication.class, args);
		ReptileRepository reptileRepository =
				configurableApplicationContext.getBean(ReptileRepository.class);
		Reptile kingCobra = new Reptile("Slither", "Snake", "Black & Yellow", "Carnivore");
		Reptile komodoDragon = new Reptile("Dennis", "Lizard", "Brown", "Carnivore");
		reptileRepository.saveAll(List.of(kingCobra, komodoDragon));

		MammalRepository mammalRepository =
				configurableApplicationContext.getBean(MammalRepository.class);
		Mammal tiger = new Mammal("Stripes", "Tiger", "Orange & Black", "Carnivore");
		Mammal gorilla = new Mammal("Jake", "Gorilla", "Black", "Herbivore");
		mammalRepository.saveAll(List.of(tiger, gorilla));
	}

}
