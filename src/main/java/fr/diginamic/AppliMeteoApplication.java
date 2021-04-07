package fr.diginamic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;


@SpringBootApplication
@EnableScheduling
public class AppliMeteoApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppliMeteoApplication.class, args);

	}
}
