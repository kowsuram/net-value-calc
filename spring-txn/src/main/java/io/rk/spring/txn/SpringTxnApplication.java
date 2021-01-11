package io.rk.spring.txn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import sun.tools.jar.CommandLine;

@SpringBootApplication
public class SpringTxnApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringTxnApplication.class, args);
	}
	
	@Autowired
	OrgService orgService;
	
	@Override
	public void run(String... args) throws Exception {
		orgService.inFormality();
	}
}
