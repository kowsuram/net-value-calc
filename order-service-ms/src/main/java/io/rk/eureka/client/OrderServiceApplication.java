package io.rk.eureka.client;

import com.netflix.discovery.EurekaClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class OrderServiceApplication {
	
	@Autowired
	@Lazy
	private EurekaClient eurekaClient;

	@GetMapping(value = "/greet")
	public String greet() {
		return "Hello world, welcome to my instance.";
	}
	
	@GetMapping(value = "/order")
	public String orderSomething() {
		return "Ordeing something..";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(OrderServiceApplication.class, args);
	}

}
