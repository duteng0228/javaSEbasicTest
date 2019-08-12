package com.neuedu.date9;

import java.awt.Point;

public class test {
	public static void main(String[] args) {
		Circle circle = new Circle(5);
		double circleArea = circle.getArea();
		System.out.println("圆形的面积："+circleArea);
		Rectangle rectangle = new Rectangle(5, 6);
		int squareArea = (int)rectangle.getArea();
		System.out.println("矩形的面积："+squareArea);
		Shap shap = new Shap(new Point(0,0));
		double contains = shap.contains(0, 4);
		System.out.println("点到圆心距离为："+contains);
		if(contains <= circle.r) {
			System.out.println("点在圆内");
		}else {
			System.out.println("点在圆外");
		}
	}

}
