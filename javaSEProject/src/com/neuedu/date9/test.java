package com.neuedu.date9;

import java.awt.Point;

public class test {
	public static void main(String[] args) {
		Circle circle = new Circle(5);
		double circleArea = circle.getArea();
		System.out.println("Բ�ε������"+circleArea);
		Rectangle rectangle = new Rectangle(5, 6);
		int squareArea = (int)rectangle.getArea();
		System.out.println("���ε������"+squareArea);
		Shap shap = new Shap(new Point(0,0));
		double contains = shap.contains(0, 4);
		System.out.println("�㵽Բ�ľ���Ϊ��"+contains);
		if(contains <= circle.r) {
			System.out.println("����Բ��");
		}else {
			System.out.println("����Բ��");
		}
	}

}
