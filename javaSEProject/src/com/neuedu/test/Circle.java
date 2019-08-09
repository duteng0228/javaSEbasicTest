package com.neuedu.test;
/**
 * @author student_dt
 * @since 2019/08/07
 * version 1.0
 */

import java.awt.Point;

public class Circle {
	
	int r;
	Point p;
	public Circle(Point p,int r) {
		this.p = p;
		this.r = r;
	}
	public double getArea() {
		double area = Math.PI*r*r;
		return area;
	}
	public double getDistence(int x,int y) {
		return Math.sqrt(Math.pow((p.x-x), 2)+Math.pow((p.y-y), 2));
	}
	public static void main(String[] args) {
		Circle circle = new Circle(new Point(0,0),5);
		System.out.println(circle.getArea());
		double distence = circle.getDistence(4,0);
		System.out.println("该点到圆心的距离"+distence);
		if(distence <= 5) {
			System.out.println("点在圆上");
		}else {
			System.out.println("点不在圆上");
		}
		
	}

}
