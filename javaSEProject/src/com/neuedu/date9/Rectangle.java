package com.neuedu.date9;


/**
* @ClassName: Rectangle
* @Description: ������
* @author student_dt
* @date 2019��8��9�� ����8:43:41
*
*/
public class Rectangle extends Shape {
	int x;
	int y;
	
	public Rectangle(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public double getArea() {
		return x*y;
	}

}
