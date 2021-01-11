package io.rk.boot.ms;

import io.rk.boot.ms.service.ATMService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;


@SpringBootApplication
public class AutomateMachineApplication {
	
	private static final Logger log = LoggerFactory.getLogger(AutomateMachineApplication.class);
	
	
	public static void main(String[] args) {
		LocalDate start = LocalDate.now();
		log.info("Application about to start");
		SpringApplication.run(AutomateMachineApplication.class, args);
		LocalDate end = LocalDate.now();
		log.debug("Application startup in " + (ChronoUnit.DAYS.between(start, end)));
	}
	
}
