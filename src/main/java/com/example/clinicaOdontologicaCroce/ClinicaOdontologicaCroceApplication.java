package com.example.clinicaOdontologicaCroce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.apache.log4j.*;


@SpringBootApplication
public class ClinicaOdontologicaCroceApplication {
	public static void main(String[] args) {

		PropertyConfigurator.configure("log4j.properties");
		SpringApplication.run(ClinicaOdontologicaCroceApplication.class, args);
	}

}
