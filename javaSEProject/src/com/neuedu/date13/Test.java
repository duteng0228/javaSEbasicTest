package com.neuedu.date13;


/**
* @ClassName: Test
* @Description: 测试类
* @author student_dt
* @date 2019年8月13日 上午11:04:20
*
*/
public class Test {
	public static void main(String[] args) {
		// 赋值多态
		Printer printer = new ColorfulPrinter();
		printer.ptint();
		// 传参多态
		// ColorfulPrinter colorfulPrinter =  new ColorfulPrinter();
		toPrinter(new BlackAndWritePrinter());
		toPrinter(new ColorfulPrinter());
		
	}
	public static void toPrinter(Printer printer) {
		printer.ptint();
	} 

}
