package com.abhinavjdwij.poc.model;

import java.io.Serializable;
import java.util.UUID;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Job implements Serializable {
	private static final long serialVersionUID = -1L;
	private String jobId;
	private String jobName;
	public Job(String jobName) {
		this.jobId = UUID.randomUUID().toString();
		this.jobName = jobName;
	}
}
