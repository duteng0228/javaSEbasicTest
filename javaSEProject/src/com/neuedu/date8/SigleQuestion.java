package com.neuedu.date8;
/**
 * @author student_du
 * @since 20190808
 * @version 1.0
 * @apiNote �̳а���
 * */

public class SigleQuestion extends Question{
	String answer;
	public SigleQuestion(int id,String text,String[] option,String answer) {
		this.id = id;
		this.text = text;
		this.option = option;
		this.answer = answer;
	}
	@Override
	public boolean checkAnswer(String[] answers) {
		if(answer == null || answers.length != 1) {
			return false;
		}
		return this.answer.equals(answers[0]);
	}
	public static void main(String[] args) {
		String[] option = {"��߸","����","�˽�","���"};
		SigleQuestion sigleQuestion = new SigleQuestion(1, "��ţ����", option, "�˽�");
		String[] answers = {"����"};
		boolean answer = sigleQuestion.checkAnswer(answers);
		System.out.println(answer);
		
	}

}
