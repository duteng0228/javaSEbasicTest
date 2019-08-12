package com.neuedu.date9;

/**
* @ClassName: Assess
* @Description: 访问控制修饰符
* @author student_dt
* @date 2019年8月9日 下午2:50:56
*
*/
public class Assess {
	public int a = 50;
	public void print() {
		System.out.println(a);
	}
	public static void main(String[] args) {
		Assess assess = new Assess();
		assess.print();
	}

}
