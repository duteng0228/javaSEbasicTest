package com.neuedu.test;

import java.util.*;

public class Test {
	public static void main(String[] args) {
		System.out.print("niahao");
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Long.MIN_VALUE);
		System.out.println(System.currentTimeMillis());
		int[] arrs = new int[300];
		Random r = new Random();
		for (int i = 0; i < arrs.length; i++) {
			arrs[i] = r.nextInt();
		}
		int[] a = Arrays.copyOf(arrs, arrs.length);
		int[] b = Arrays.copyOf(arrs, arrs.length);
		
		long start = System.currentTimeMillis();
		Arrays.sort(a);
		long end = System.currentTimeMillis();
		System.out.println("系统API所花时间:"+(end-start));
		
		
		
		long start2 = System.currentTimeMillis();
		chooseSort(b);
		long end2 = System.currentTimeMillis();
		System.out.println("选择排序所花时间:"+(end2-start2));
	}
	public static int[] chooseSort(int[] b) {
		for(int i=0;i<b.length;i++) {
			for(int j=i+1;j<b.length-1;j++) {
				if(b[i] > b[j]) {
					int temp = b[i];
					b[i] = b[j];
					b[j] = temp;
				}
			}
		}
		return b;
	}
}
