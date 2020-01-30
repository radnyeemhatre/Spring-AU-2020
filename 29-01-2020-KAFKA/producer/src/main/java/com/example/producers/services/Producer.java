package com.example.producers.services;


	import org.slf4j.Logger;
	import org.slf4j.LoggerFactory;
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.kafka.core.KafkaTemplate;
	import org.springframework.stereotype.Service;

	@Service
	public class Producer {
		private static final Logger logger = LoggerFactory.getLogger(Producer.class);
		private static final String topic = "stream1";
		@Autowired
		private KafkaTemplate<String, String> kafkaTemplate;

		public void sendmsg(String msg) {
			System.out.println(String.format("Produced at Producer: "+ msg));
			this.kafkaTemplate.send(topic, msg);
		}
	}



