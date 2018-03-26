package com.example.mybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
//@MapperScan("com.example.mybatis.mapper")
// 集成mapper时需要使用tk.mybatis.spring.annotation.MapperScan而不是org.mybatis.spring.annotation.MapperScan
@tk.mybatis.spring.annotation.MapperScan("com.example.mybatis.mapper")
@ServletComponentScan
public class MybatisApplication {

	public static void main(String[] args) {
		SpringApplication.run(MybatisApplication.class, args);
	}
}
