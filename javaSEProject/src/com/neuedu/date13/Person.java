package com.neuedu.date13;


/**
* @ClassName: Person
* @Description: �������ѧϰ��װ
* @author student_dt
* @date 2019��8��13�� ����2:54:42
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
