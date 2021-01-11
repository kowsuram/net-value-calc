package io.rk.boot.ms.config;

import io.rk.boot.ms.model.ATMCard;
import io.rk.boot.ms.service.ATMService;
import io.rk.boot.ms.service.impl.ATMServiceImpl;
import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
import org.springframework.kafka.core.ConsumerFactory;
import org.springframework.kafka.core.DefaultKafkaConsumerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;
import org.springframework.kafka.support.serializer.JsonDeserializer;

import java.util.HashMap;
import java.util.Map;

@EnableKafka
@Configuration
public class ATMConfig {

	@Bean
	public ATMService atmService() {
		return new ATMServiceImpl();
	}
	
	
	@Bean
	public ConsumerFactory<String, ATMCard> consumerFactory() {
		Map<String, Object> props = new HashMap<>();
		props.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
		props.put(ConsumerConfig.GROUP_ID_CONFIG, "boot-group");
		return new DefaultKafkaConsumerFactory(props, new StringDeserializer(), new JsonDeserializer(ATMCard.class));
	}
	
	@Bean
	public ConcurrentKafkaListenerContainerFactory<String, ATMCard> kafkaListenerContainerFactory() {
		ConcurrentKafkaListenerContainerFactory<String, ATMCard> factory = new ConcurrentKafkaListenerContainerFactory<>();
		factory.setConsumerFactory(consumerFactory());
		return factory;
	}

}
