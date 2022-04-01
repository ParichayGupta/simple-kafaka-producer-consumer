package com.kafka.producer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class kafkaProducerController {
	private static final String TOPIC = "greetings";
	
	@Autowired
	KafkaTemplate<String, String> template;
	
	@GetMapping(value = "/greet/{message}")
	public String send(@PathVariable String message) {
		template.send(TOPIC,message);
		return message+" published to "+TOPIC;
	}

}
