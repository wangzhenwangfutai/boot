package com.example.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@ImportResource({"classpath:disconf.xml"})//关于disconf配置文件的
@MapperScan("com.example.demo.dao")//关于mybatis的
@SpringBootApplication
public class HunjingyunApplication {

	public static void main(String[] args) {
		SpringApplication.run(HunjingyunApplication.class, args);
	}
}
