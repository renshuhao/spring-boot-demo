package com.wealthlake.sb_demo.web;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.wealthlake.sb_demo")
@MapperScan("com.wealthlake.sb_demo.dataaccess") // mybatis mapper扫描包
public class SbDemoWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbDemoWebApplication.class, args);
	}

}
