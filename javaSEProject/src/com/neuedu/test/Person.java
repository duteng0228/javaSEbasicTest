package com.neuedu.test;


public class Person {
	// 编号、名字、性别、年龄、婚否、身份证号、地址、电话、伴侣
	int num;
	String name;
	char sex;
	int age;
	boolean marry;
	String  id;
	String address;
	String tel;
	String partner;
	

	public Person(int num, String name, char sex, int age, boolean marry, String id, String address, String tel,
			String partner) {
		super();
		this.num = num;
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.marry = marry;
		this.id = id;
		this.address = address;
		this.tel = tel;
		this.partner = partner;
	}
	public boolean marryWith(Person anotherP) {
		if(this.age >= (this.sex == '男' ? 22:20) && anotherP.age >= (anotherP.sex == '女' ? 20:20)) {
			if(this.marry == false && anotherP.marry == false) {
				if(this.sex != anotherP.sex) {
					this.marry = true;
					anotherP.marry = true;
					this.partner = anotherP.name;
					anotherP.partner = this.name;
					return true;
				}
			}
		}
		return false;
	}
	public static void main(String[] args) {
		Person person = new Person(001,"许仙",'男',22,false,"123456789987456123","杭州","456123789",null);
		Person person2 = new Person(002,"白素贞",'女',20,false,"123456789987456123","杭州","456123789",null);
		boolean marry = person.marryWith(person2);
		System.out.print(marry);

	}
	
	

}
