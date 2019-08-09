package com.neuedu.test;

public class Student {
	public static void main(String[] args) {
		Student student = new Student();
		boolean writelog = student.writeLog("写日志是不可能的");
		System.out.println(writelog == true ? "写日志了":"没有写日志");
		
	}
	
	// 学号
	String stuNo;
	// 性别
	char sex;
	// 姓名
	String name;
	// 年龄
	short age;
	
	public boolean writeLog(String log) {
		if(log == null) {
			return false;
		}else {
			return true;
		}
	}

}
