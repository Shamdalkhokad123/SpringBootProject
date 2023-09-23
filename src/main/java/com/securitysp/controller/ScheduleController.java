package com.securitysp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.securitysp.scheduler.MyScheduleTask;

@RestController
public class ScheduleController {
	
	@Autowired 
	MyScheduleTask task;
	
	@GetMapping("/hello")
	public String getSchdule() {
		System.out.println("Welcome to become master in scheduler");
		task.myTask();
		return "This is first time ";
	}

}
