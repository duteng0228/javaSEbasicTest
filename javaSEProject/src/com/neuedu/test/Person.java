package com.neuedu.test;


public class Person {
	// ��š����֡��Ա����䡢������֤�š���ַ���绰������
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
		if(this.age >= (this.sex == '��' ? 22:20) && anotherP.age >= (anotherP.sex == 'Ů' ? 20:20)) {
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
		Person person = new Person(001,"����",'��',22,false,"123456789987456123","����","456123789",null);
		Person person2 = new Person(002,"������",'Ů',20,false,"123456789987456123","����","456123789",null);
		boolean marry = person.marryWith(person2);
		System.out.print(marry);

	}
	
	

}
