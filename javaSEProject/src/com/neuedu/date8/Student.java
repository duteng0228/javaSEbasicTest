package com.neuedu.date8;
/**
 * @author student_du
 * @since 20190808
 * @version 1.0
 * @apiNote Ñ§ÉúÀà
 * */

public class Student {
	String name;
	int sno;
	int score;
	
	public Student(String name, int sno, int score) {
		this.name = name;
		this.sno = sno;
		this.score = score;
	}

	public static void sort(Student[] stus) {
		Student stu;
		for(int i = 0;i < stus.length-1;i++) {
			for(int j = 0;j < stus.length - i - 1;j++) {
				if(stus[j].score > stus[j+1].score) {
					stu = stus[j];
					stus[j] = stus[j+1];
					stus[j+1] = stu;
				}
			}
		}
	}
	public static void main(String[] args) {
		Student[] stus = new Student[3];
		stus[0] = new Student("tom", 1, 89);
		stus[1] = new Student("marry", 2, 65);
		stus[2] = new Student("scott", 3, 77);
		Student.sort(stus);
		
	}

}
