package com.neuedu.date8;
/**
 * @author student_du
 * @since 20190808
 * @version 1.0
 * @apiNote 继承案例
 * */

public class Question {
	// 题号
	int id;
	// 题干
	String text;
	// 选项
	String[] option;
	// 比较
    public boolean checkAnswer(String[] Answers) {
    	return false;
    }
	// 输出题目信息
	public void printText() {
		System.out.println("题号:"+id+"题干"+text);
		for(int i=0;i<option.length;i++) {
			System.out.println(option[i]);
		}
	}
	

}
