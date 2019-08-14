package com.neuedu.date12;


import java.util.Arrays;

/**
* @ClassName: StringDemo
* @Description: String API方法
* @author student_dt
* @date 2019年8月12日 下午7:31:32
*
*/
public class StringDemo {
	public static void main(String[] args) {
		char[] chs = {'天','津'};
		char[] chs1 = {'东','软'};
		char[] chs2 = Arrays.copyOf(chs, chs.length+chs1.length);
		System.arraycopy(chs1, 0, chs2, chs.length,chs1.length);
		System.out.println(Arrays.toString(chs2));
		
		String str1 = "天津";
		String str2 = "东软";
		String str3 = str1.concat(str2);
		System.out.println(str3);
		
		String str4 = "今天天气不错,我很开心,还不错";
		String[] str5 = str4.split(",");
		for(int i=0;i<str5.length;i++) {
			System.out.println(str5[i]);
		}
		for(String str6:str5) {
			System.out.println(str6);
		}
		
		String str7 = "nihaodongruan";
		boolean startsWith = str7.startsWith("ni");
		System.out.println(startsWith);
		
		String str8 = "neuedu";
		String replace = str8.replace('e', 'm');
		System.out.println(replace);
		
		String str9 = "substring";
		String sub = str9.substring(0,4);
		System.out.println(sub);
		
		String str10 = "toCharArray";
		char[] ca = str10.toCharArray();
		for(char cas:ca) {
			System.out.println(cas);
		}
		String str11 = "TOLOWERCASE";
		String toLowercase = str11.toLowerCase();
		System.out.println(toLowercase);
		String str12 = "touppercase";
		String touppercase = str12.toUpperCase();
		System.out.println(touppercase);
		
		String str13 = " ni  hao ";
		System.out.println(str13.trim());
		
		int num = 100;
		String str14 = String.valueOf(num);
		System.out.println(str14+100);
		String str15 = "nihaoneuedu";
		boolean endsWith = str15.endsWith("5");
		System.out.println(endsWith);
		
		String str16 = "你好东软";
		char[] newArray = new char[4];
		str16.getChars(0, 3, newArray, 0);
		String str17 = new String(newArray);
		System.out.println(str17);
		// 字符在String中出现的位置
		String str18 = "黑化肥会发黑";
		int indexOf = str18.indexOf("黑");
		System.out.println(indexOf);
		// 字符在String类型中出现的最后一个 位置
        String str19 = "黑化肥会发黑";
        int lastIndexOf = str19.lastIndexOf("黑");
        System.out.println(lastIndexOf);
        // 判断String 是否为空
        String str20 = "";
        boolean isEmpty = str20.isEmpty();
        System.out.println(isEmpty);
	}

}
