package com.neuedu.date9;


/**
* @ClassName: Circle
* @Description: Բ��
* @author student_dt
* @date 2019��8��9�� ����8:43:09
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
