package com.jiji.day01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("student")
public class MyStudent {
	
	@Value(value = "lisi")
	private String name;
	
	@Value("45")
	private int  age;
	
	@Autowired(required =false)
	@Qualifier(value = "school")
	private School s;
	
	public School getS() {
		return s;
	}
	public void setS(School s) {
		this.s = s;
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
	@Override
	public String toString() {
		return "MyStudent [name=" + name + ", age=" + age + ", s=" + s + "]";
	}
	
	
	
}
