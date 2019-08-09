package com.neuedu.date8;

import java.util.Scanner;

public class Factorial {
	public static int factor(int n) {
		int num = 1;
		for(int i=1;i <= n;i++) {
			num = num*i;
		}
		return num;
	}
	public static int year(int y) {
		if(y%400 == 0 || y%4 == 0 && y%100 !=0) {
			System.out.println("闰年");
		}else {
			System.out.println("平年");
		}
		return y;
	}
	public static void main(String[] args) {
	    Scanner scanner =  new Scanner(System.in);
	    System.out.println("请输入一个数：");
	    int N = scanner.nextInt();
	    System.out.println(factor(N));
	    System.out.println(year(2004));
	    
	    
	
	}

}
