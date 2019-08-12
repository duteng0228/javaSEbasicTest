package com.neuedu.date10;

/**
* @ClassName: Question
* @Description: 单选题类
* @author student_dt
* @date 2019年8月10日 下午3:01:58
*
*/
// SingleChoice 包含属性
// 选项： String[] options


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
