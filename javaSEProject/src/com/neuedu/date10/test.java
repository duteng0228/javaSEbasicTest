package com.neuedu.date10;

public class test {
	public static void main(String[] args) {
		SingleChoice singleChoice = new SingleChoice("你喜欢的车的类型",new String[] {"1.宝马","2.宾利","3.劳斯莱斯","4.迈巴赫"},3);
		int[] answers = {3};
	    boolean answer = singleChoice.check(answers);
	    System.out.println(answer);
	    MultiChoice multiChoice = new MultiChoice("你喜欢的车的类型",new String[] {"1.宝马","2.宾利","3.劳斯莱斯","4.迈巴赫"}, new int[] {1,3});
	    int[] answers1 = new int[]{1,3};
	    boolean check = multiChoice.check(answers1);
	    System.out.println(check);
	}

}
