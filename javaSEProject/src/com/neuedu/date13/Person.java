package com.neuedu.date13;


/**
* @ClassName: Person
* @Description: 用这个类学习封装
* @author student_dt
* @date 2019年8月13日 下午2:54:42
*
*/
public class Person {
	private String name;
	private int age;
	public void setAge(int age) {
		if(age <= 0) {
			this.age = 0;
		}else {
			this.age = age;
		}
	}
	public int getAge() {
		return this.age;
	}
}
