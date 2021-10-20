package com.javaGG.ex;
import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;


@Configuration
@ImportResource("classpath:applicationCTX.xml")
public class ApplicationConfig {
	
	@Bean
	public Student student1() {
		
		ArrayList<String> hobbies = new ArrayList<String>();
		hobbies.add("수영");
		hobbies.add("운동");
		hobbies.add("영화감상");
		
		Student student = new Student("홍길동", 20, hobbies);
		
		student.setHeight(170);
		student.setWeight(70);
		
		return student;
	}
	
	@Bean
	public Student student2() {
		
		ArrayList<String> hobbies = new ArrayList<String>();
		hobbies.add("활쏘기");
		hobbies.add("일기쓰기");		
		
		Student student = new Student("이순신",40,hobbies);
		
		student.setHeight(180);
		student.setWeight(80);
		
		return student;
	}

}