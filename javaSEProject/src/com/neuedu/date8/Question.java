package com.neuedu.date8;
/**
 * @author student_du
 * @since 20190808
 * @version 1.0
 * @apiNote �̳а���
 * */

public class Question {
	// ���
	int id;
	// ���
	String text;
	// ѡ��
	String[] option;
	// �Ƚ�
    public boolean checkAnswer(String[] Answers) {
    	return false;
    }
	// �����Ŀ��Ϣ
	public void printText() {
		System.out.println("���:"+id+"���"+text);
		for(int i=0;i<option.length;i++) {
			System.out.println(option[i]);
		}
	}
	

}
