package com.neuedu.date13;


/**
* @ClassName: Test
* @Description: ������
* @author student_dt
* @date 2019��8��13�� ����11:04:20
*
*/
public class Test {
	public static void main(String[] args) {
		// ��ֵ��̬
		Printer printer = new ColorfulPrinter();
		printer.ptint();
		// ���ζ�̬
		// ColorfulPrinter colorfulPrinter =  new ColorfulPrinter();
		toPrinter(new BlackAndWritePrinter());
		toPrinter(new ColorfulPrinter());
		
	}
	public static void toPrinter(Printer printer) {
		printer.ptint();
	} 

}
