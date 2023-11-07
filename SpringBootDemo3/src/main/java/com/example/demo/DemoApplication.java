package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// 1日志分级配置，2使用slf4j包下的Logger对象打印日志，3使用@Slf4j注解打印日志
@SpringBootApplication
public class DemoApplication {
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}

//SLF4J + Logback