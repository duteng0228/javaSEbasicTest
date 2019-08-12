package com.neuedu.date9;


/**
* @ClassName: Rectangle
* @Description: 矩形类
* @author student_dt
* @date 2019年8月9日 下午8:43:41
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
