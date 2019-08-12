package com.neuedu.date10;

import java.util.Arrays;

/**
* @ClassName: Question
* @Description: 多选题类
* @author student_dt
* @date 2019年8月10日 下午3:01:58
*
*/
// MultiChoice 包含属性
// 选项： String[] options

public class MultiChoice extends Question{
	String[] options;
	int[] answers;
	public MultiChoice(String text, String[] options, int[] answers) {
		this.text = text;
		this.options = options;
		this.answers = answers;
	}
	@Override
	public boolean check(int[] answers1) {
		if(answers1 != null || answers1.length == answers.length) {
			Arrays.sort(answers1);
			for(int i=0;i<answers1.length;i++) {
				if(answers1[i] != answers[i] ) {
					return false;
				}
			}
		}
		return true;
	}

}
