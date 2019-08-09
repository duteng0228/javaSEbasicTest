package com.neuedu.date8;
/**
 * @author student_du
 * @since 20190808
 * @version 1.0
 * @apiNote ¼Ì³Ð°¸Àý
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
		String[] option = {"ÄÄß¸","ºï×Ó","°Ë½ä","Ñîê¯"};
		SigleQuestion sigleQuestion = new SigleQuestion(1, "×îÅ£µÄÈË", option, "°Ë½ä");
		String[] answers = {"ºï×Ó"};
		boolean answer = sigleQuestion.checkAnswer(answers);
		System.out.println(answer);
		
	}

}
