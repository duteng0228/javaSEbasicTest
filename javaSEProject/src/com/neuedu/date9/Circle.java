package com.neuedu.date9;


/**
* @ClassName: Circle
* @Description: 圆类
* @author student_dt
* @date 2019年8月9日 下午8:43:09
*
*/
public class Circle extends Shape {
	int r;
	
	public Circle(int r) {
		this.r = r;
	}
	
	@Override
	public double getArea() {
		return Math.PI*r*r;
	}


}
