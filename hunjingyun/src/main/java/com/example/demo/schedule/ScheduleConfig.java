package com.example.demo.schedule;

import java.util.Date;

import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;




//定时任务 不需要另外引用任何jar
//在类上加注解@EnableScheduling @Component
//在方法上引用 @Scheduled


// @EnableScheduling
@Component
public class ScheduleConfig {
	
	//@Scheduled(cron = "0/5 * * * * ?")
	public void  doSchedule() {
		System.out.println(new Date().toString());
	}

}
