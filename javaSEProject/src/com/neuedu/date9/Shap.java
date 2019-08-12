package com.neuedu.date9;

import java.awt.Point;

public class Shap extends Shape {
	Point p;
	
	public Shap(Point p) {
		this.p = p;
	}

	@Override
	public double contains(int x, int y) {
		return Math.sqrt(Math.pow((p.x - x),2)+Math.pow((p.y - y),2));
	}

}
