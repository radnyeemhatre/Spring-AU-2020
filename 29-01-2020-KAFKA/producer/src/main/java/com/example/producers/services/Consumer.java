package com.example.producers.services;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {
	
	@KafkaListener(topics = "stream2", groupId = "groupId")
	public void consume(String msg) {
		
		System.out.println("Consuming at Consumer: "+msg);
	}
}
