package com.indicom;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.indicom.*")
@ComponentScan(basePackages = "com.indicom.*")
public class IndicomApplication {

	public static void main(String[] args) {
		SpringApplication.run(IndicomApplication.class, args);
	}

}
