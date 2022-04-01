package com.kafka.consumer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;

import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {

	private static final String KAFKA_TOPIC = "greetings";

	@KafkaListener(topics = KAFKA_TOPIC,groupId = "kafka-topic-client")
	public void receiveKafkaMessage(String message) {
		System.out.println("Message: " +message+" consumed from kafka topic: "+KAFKA_TOPIC);
		}
	}
