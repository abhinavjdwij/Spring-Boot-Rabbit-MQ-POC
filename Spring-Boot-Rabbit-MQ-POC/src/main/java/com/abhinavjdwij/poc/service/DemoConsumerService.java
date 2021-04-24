package com.abhinavjdwij.poc.service;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

import com.abhinavjdwij.poc.model.Job;

@Service
public class DemoConsumerService {
	
	@RabbitListener(queues = "${rabbitmq.queue.demo}")
	public void consumeDemoJob(Job demoJob) {
		System.out.println("Job Consumed from Queue : " + demoJob);
	}
}
