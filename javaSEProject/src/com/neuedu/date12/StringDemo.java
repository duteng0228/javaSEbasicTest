package com.neuedu.date12;


import java.util.Arrays;

/**
* @ClassName: StringDemo
* @Description: String API����
* @author student_dt
* @date 2019��8��12�� ����7:31:32
*
*/
public class StringDemo {
	public static void main(String[] args) {
		char[] chs = {'��','��'};
		char[] chs1 = {'��','��'};
		char[] chs2 = Arrays.copyOf(chs, chs.length+chs1.length);
		System.arraycopy(chs1, 0, chs2, chs.length,chs1.length);
		System.out.println(Arrays.toString(chs2));
		
		String str1 = "���";
		String str2 = "����";
		String str3 = str1.concat(str2);
		System.out.println(str3);
		
		String str4 = "������������,�Һܿ���,������";
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
		
		String str16 = "��ö���";
		char[] newArray = new char[4];
		str16.getChars(0, 3, newArray, 0);
		String str17 = new String(newArray);
		System.out.println(str17);
		// �ַ���String�г��ֵ�λ��
		String str18 = "�ڻ��ʻᷢ��";
		int indexOf = str18.indexOf("��");
		System.out.println(indexOf);
		// �ַ���String�����г��ֵ����һ�� λ��
        String str19 = "�ڻ��ʻᷢ��";
        int lastIndexOf = str19.lastIndexOf("��");
        System.out.println(lastIndexOf);
        // �ж�String �Ƿ�Ϊ��
        String str20 = "";
        boolean isEmpty = str20.isEmpty();
        System.out.println(isEmpty);
	}

}
