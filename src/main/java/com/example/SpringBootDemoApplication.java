package com.example;


import com.example.base.config.RedisConfig;
import com.example.config.DynamicDataSourceRegister;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@MapperScan("com.example.mapper")
@ServletComponentScan("com.example.config")
@Import({DynamicDataSourceRegister.class,RedisConfig.class})
public class SpringBootDemoApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemoApplication.class, args);
	}
}
