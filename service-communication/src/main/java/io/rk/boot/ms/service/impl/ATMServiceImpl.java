package io.rk.boot.ms.service.impl;

import io.rk.boot.ms.model.ATMCard;
import io.rk.boot.ms.model.Transaction;
import io.rk.boot.ms.service.ATMService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class ATMServiceImpl implements ATMService {
	
	@Autowired
	KafkaTemplate kafkaTemplate;
	
	Logger logger = LoggerFactory.getLogger("SERVICE_LOGS");
	
	@Override
	public void readCard(ATMCard atmCard) {
		logger.debug("ATMServiceImpl.readCard() {}", atmCard.getAtmNumber());
		kafkaTemplate.send("kafka-boot-topic", atmCard.getCustomerName());
	}
	
	@Override
	public void removeCard(ATMCard atmCard) {
	
	}
	
	@Override
	public void transact(ATMCard atmCard, Transaction transaction) {
	
	}
}
