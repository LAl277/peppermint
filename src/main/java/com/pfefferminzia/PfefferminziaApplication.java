package com.pfefferminzia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.pfefferminzia.*")
@ComponentScan(basePackages = {"com.pfefferminzia.*"})
@EntityScan("com.pfefferminzia.*")
public class PfefferminziaApplication {

	public static void main(String[] args) {

		SpringApplication.run(PfefferminziaApplication.class, args);
	}

}
