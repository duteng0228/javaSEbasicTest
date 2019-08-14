package com.neuedu.date13;


/**
* @ClassName: Wrapper
* @Description: 包装类
* @author student_dt
* @date 2019年8月13日 下午3:07:06
*
*/
public class Wrapper {
	public static void main(String[] args) {
		//Integer i1 = Integer.valueOf(15);
		Integer i1 = 15;
		int i2 = i1.intValue();
		System.out.println(i2);
		// int i3 = i1.intValue();
		int i3 = i1;
		System.out.println(i3);
		
		int num = 24;
		int n = Integer.valueOf(num);
		System.out.println(n);
		
		
		
	}
}
