package com.neuedu.date8;
/**
 * @author student_du
 * @since 20190808
 * @version 1.0
 * @apiNote 笔记本类
 * */

public class Notebook {
	char color;
	int cpu;
	public Notebook() {
		
	}
	public Notebook(char color, int cpu) {
		this.color = color;
		this.cpu = cpu;
	}
	public String Print() {
		System.out.println("颜色为"+color);
		System.out.println("型号为"+cpu);
		return null;
	}
	public static void main(String[] args) {
		Notebook notebook = new Notebook('黑',9350);
		notebook.Print();
	}
	

}
