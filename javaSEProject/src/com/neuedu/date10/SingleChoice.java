package com.neuedu.date10;

/**
* @ClassName: Question
* @Description: ��ѡ����
* @author student_dt
* @date 2019��8��10�� ����3:01:58
*
*/
// SingleChoice ��������
// ѡ� String[] options


public class SingleChoice extends Question{
	 String[] options;
	 int answer;
	public SingleChoice(String text, String[] options, int answer) {
		this.text = text;
		this.options = options;
		this.answer = answer;
	}
	@Override
	public boolean check(int[] answers) {
		if(answers == null || answers.length != 1) {
			return false;
		}
		return this.answer == answers[0];
	}
	 

}
