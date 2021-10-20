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
		hobbies.add("����");
		hobbies.add("�");
		hobbies.add("��ȭ����");
		
		Student student = new Student("ȫ�浿", 20, hobbies);
		
		student.setHeight(170);
		student.setWeight(70);
		
		return student;
	}
	
	@Bean
	public Student student2() {
		
		ArrayList<String> hobbies = new ArrayList<String>();
		hobbies.add("Ȱ���");
		hobbies.add("�ϱ⾲��");		
		
		Student student = new Student("�̼���",40,hobbies);
		
		student.setHeight(180);
		student.setWeight(80);
		
		return student;
	}

}