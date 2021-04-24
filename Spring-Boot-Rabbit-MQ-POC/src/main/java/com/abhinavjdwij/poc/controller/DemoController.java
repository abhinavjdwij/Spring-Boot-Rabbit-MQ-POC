package com.abhinavjdwij.poc.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abhinavjdwij.poc.service.DemoProducerService;

@RestController
@RequestMapping("/demo")
public class DemoController {
	
	@Autowired
	DemoProducerService demoProducer;
	
	@GetMapping("/initJob/{jobName}")
	public Map<String, String> initJob(@PathVariable String jobName) {
		Map<String, String> response = new HashMap<>();
		demoProducer.produceDemoJob(jobName);
		response.put("Status", jobName + " job added to demo queue");
		return response;
	}

}
