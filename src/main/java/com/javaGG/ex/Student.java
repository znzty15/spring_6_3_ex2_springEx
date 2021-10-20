package com.javaGG.ex;
import java.util.ArrayList;

public class Student {
	
	private String name;
	private int age;
	private ArrayList<String> hobbies;
	private double height;
	private double weight;
	
	public Student(String name, int age, ArrayList<String> hobbies) {
		this.name = name;
		this.age = age;
		this.hobbies = hobbies;		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public ArrayList<String> getHobbys() {
		return hobbies;
	}

	public void setHobbys(ArrayList<String> hobbies) {
		this.hobbies = hobbies;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	
}