package com.neuedu.date8;
/**
 * @author student_du
 * @since 20190808
 * @version 1.0
 * @apiNote 矩形类
 * */


public class Rectangle {
	int length;
	int width;
	
	public Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}
	public int getArea() {
		int Area = length*width;
		System.out.println("面积为"+Area);
		return Area;
	}
	public int getPer() {
		int Per = (length+width)*2;
		System.out.println("周长为"+Per);
		return Per;
	}
	public String showAll() {
		System.out.println(length);
		System.out.println(width);
		getArea();
		getPer();
		return null;
	}
	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle(5,6);
		rectangle.showAll();
		
	}

}
