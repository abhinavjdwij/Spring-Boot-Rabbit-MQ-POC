package com.abhinavjdwij.poc.service;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.abhinavjdwij.poc.model.Job;

@Service
public class DemoProducerService {
	
	@Autowired
	RabbitTemplate rabbitTemplate;
	
	@Value("${rabbitmq.exchange.demo}")
	private String topicExchangeName;
	
	@Value("{rabbitmq.routingkey.demo}")
	private String routingKeyName;
	
	public void produceDemoJob(String jobName) {
		Job demoJob = new Job(jobName);
		rabbitTemplate.convertAndSend(topicExchangeName, routingKeyName, demoJob);
	}
	
}
