package com.neuedu.date9;
/**
 * @author student_du
 * @since 20190809
 * @version 1.0
 * @apiNote ����
 * */

public class Person {
	String name;
	int age;
	double height;
	
	
	public Person(String name, int age, double height) {
		this.name = name;
		this.age = age;
		this.height = height;
	}
	public String sayHello() {
		System.out.println("hello,my name is"+name);
		return name;
	}
	public static void main(String[] args) {
		Person person = new Person("���",18,1.75);
		String str = person.sayHello();
		System.out.println(str);
	}

}
