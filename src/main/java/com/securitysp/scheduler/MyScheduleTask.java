package com.securitysp.scheduler;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class MyScheduleTask {

	 @Scheduled(fixedRate = 5000) // Execute every 5 seconds
	    public void myTask() {
	        // Your task logic goes here
	        System.out.println("Scheduled task executed at: " + new Date());
	    }
}
