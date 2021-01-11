package io.rk.boot.ms.controller;

import io.rk.boot.ms.model.ATMCard;
import io.rk.boot.ms.service.ATMService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ATMController {
	
	@Autowired
	ATMService atmService;
	
	@GetMapping("/read")
	public String readCard() {
		atmService.readCard(new ATMCard("1212121212", "Ramanjineyulu Kowsu", 781, "07/10","XXXX"));
		return "Read completed";
	}
}
