package com.neuedu.date14;

public class StringDemo {
	public static void main(String[] args) {
		String str = "hello";
		StringBuffer stringBuffer = new StringBuffer();
		System.out.println(stringBuffer.append("hello").append("neuedu"));
		stringBuffer.insert(0, "k");
		System.out.println(stringBuffer);
		stringBuffer.delete(0, 6);
		System.out.println(stringBuffer);
		System.out.println(stringBuffer.capacity());
		System.out.println(testString(100000));
		System.out.println(testStringBuilder(100000));
	}
	public static int testString(int n) {
		long start = System.currentTimeMillis();
		String str = "";
		for(int i=0;i<n;i++) {
			str +="a";
		}
		long end = System.currentTimeMillis();
		return(int)(end-start);
	}
	public static int testStringBuilder(int n) {
		long start = System.currentTimeMillis();
		StringBuilder builder = new StringBuilder();
		for(int i=0;i<n;i++) {
			builder.append("a");
		}
		long end = System.currentTimeMillis();
		return(int)(end-start);
	}

}
