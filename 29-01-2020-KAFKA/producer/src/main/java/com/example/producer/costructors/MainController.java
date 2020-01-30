package com.example.producer.costructors;

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.producers.services.Producer;

@RestController
@RequestMapping(value = "/main")
public class MainController {
	private final Producer producer;

	@Autowired
	public MainController(Producer producer) {
		this.producer = producer;
	}

	@PostMapping(value = "/produce")
	public void sendMessageToKafkaTopic(@RequestParam("message") String message) {
		Timer timer = new Timer();
		timer.schedule(new TimerTask() {
			@Override
			public void run() {
				Random random = new Random();
				int no= random.nextInt(50000);
				producer.sendmsg(no+"");
			}
		}, 0, 2000);
	}
}

