package com.example;

import com.example.config.DynamicDataSourceRegister;
import com.example.util.SpringUtil;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@MapperScan("com.example.mapper")
@ServletComponentScan("com.example.config")
@Import({DynamicDataSourceRegister.class,SpringUtil.class})
public class SpringBootDemoApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemoApplication.class, args);
	}
}
