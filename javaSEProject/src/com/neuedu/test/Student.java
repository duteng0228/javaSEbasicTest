package com.neuedu.test;

public class Student {
	public static void main(String[] args) {
		Student student = new Student();
		boolean writelog = student.writeLog("д��־�ǲ����ܵ�");
		System.out.println(writelog == true ? "д��־��":"û��д��־");
		
	}
	
	// ѧ��
	String stuNo;
	// �Ա�
	char sex;
	// ����
	String name;
	// ����
	short age;
	
	public boolean writeLog(String log) {
		if(log == null) {
			return false;
		}else {
			return true;
		}
	}

}
