package com.neuedu.date10;



/**
* @ClassName: test
* @Description: ������Ĳ�����
* @author student_dt
* @date 2019��8��12�� ����7:32:07
*
*/
public class test {
	public static void main(String[] args) {
		SingleChoice singleChoice = new SingleChoice("��ϲ���ĳ�������",new String[] {"1.����","2.����","3.��˹��˹","4.���ͺ�"},3);
		int[] answers = {3};
	    boolean answer = singleChoice.check(answers);
	    System.out.println(answer);
	    MultiChoice multiChoice = new MultiChoice("��ϲ���ĳ�������",new String[] {"1.����","2.����","3.��˹��˹","4.���ͺ�"}, new int[] {1,3});
	    int[] answers1 = new int[]{1,3};
	    boolean check = multiChoice.check(answers1);
	    System.out.println(check);
	}

}
