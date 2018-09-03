package com.example.demo.nsync;

import java.util.concurrent.Future;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.stereotype.Component;


@EnableAsync
@Component
public class NsyncCompent {
	
	@Async
	public Future<String> task1(){
		long l1 = System.currentTimeMillis();
		try {
			Thread.sleep(1200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		long l2 = System.currentTimeMillis();
		System.out.println("task1"+(l2-l1));
		
		return new AsyncResult<String>("执行完毕");
	}
	
	@Async
	public Future<String> task2(){
		long l1 = System.currentTimeMillis();
		try {
			Thread.sleep(700);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		long l2 = System.currentTimeMillis();
		System.out.println("task2"+(l2-l1));
		
		return new AsyncResult<String>("执行完毕");
	}
	
	@Async
	public Future<String> task3(){
		long l1 = System.currentTimeMillis();
		try {
			Thread.sleep(600);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		long l2 = System.currentTimeMillis();
		System.out.println("task3"+(l2-l1));
		
		return new AsyncResult<String>("执行完毕");
	}
	

}
