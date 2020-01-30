package com.example.producers.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class StreamProcessor {
	
	
	private String msg;
	private static final String topic = "stream2";
	
	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;

	public void sendmsg() {
		System.out.println(String.format("StreamProcessor: "+ this.msg));
		this.kafkaTemplate.send(topic, this.msg);
	}
	
	@KafkaListener(topics = "stream1", groupId = "groupId")
	public void consumeStreamProcessor(String msg) {
		int no = Integer.parseInt(msg);
		if(no % 2 != 0) {
			int l = String.valueOf(msg).length();
			this.msg = "Odd Number length: "+l ;
		} else {
			this.msg = "Even Number";
		}
		this.sendmsg();
	}
}
