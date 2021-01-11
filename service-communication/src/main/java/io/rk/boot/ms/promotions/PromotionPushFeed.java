package io.rk.boot.ms.promotions;

import io.rk.boot.ms.model.ATMCard;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
public class PromotionPushFeed {

	Logger logger = LoggerFactory.getLogger("PROMO_LOGS");
	@KafkaListener(groupId = "boot-group", topics = {"kafka-boot-topic"}, id = "bootTopicReader", containerFactory = "kafkaListenerContainerFactory")
	public void readMessage(@Payload ATMCard atmCard) {
		logger.debug("PromotionPushFeed.readMessage() {}", atmCard.getCustomerName());
	}
}
