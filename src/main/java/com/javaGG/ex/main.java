package com.javaGG.ex;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		
		Student student1 = ctx.getBean("student1",Student.class);
		System.out.println(student1.getName());//홍길동
		System.out.println(student1.getAge());//20
		System.out.println(student1.getHobbys());//수영,운동,영화감상
		System.out.println(student1.getHeight());//170
		System.out.println(student1.getWeight());//70
		System.out.println();
		
		Student student2 = ctx.getBean("student2",Student.class);
		System.out.println(student2.getName());//홍길동
		System.out.println(student2.getAge());//20
		System.out.println(student2.getHobbys());//수영,운동,영화감상
		System.out.println(student2.getHeight());//170
		System.out.println(student2.getWeight());//70
		System.out.println();
		
		Student student3 = ctx.getBean("student3",Student.class);
		System.out.println(student3.getName());//홍길동
		System.out.println(student3.getAge());//20
		System.out.println(student3.getHobbys());//수영,운동,영화감상
		System.out.println(student3.getHeight());//170
		System.out.println(student3.getWeight());//70
		System.out.println();
		
		ctx.close();
	}

}