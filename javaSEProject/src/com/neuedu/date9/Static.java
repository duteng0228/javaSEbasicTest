package com.neuedu.date9;


/**
* @ClassName: Static
* @Description: static���ȼ�
* @author student_dt
* @date 2019��8��9�� ����2:45:19
*
*/
public class Static {
	static {
		System.out.println("1");
	}
	{
		System.out.println("2");
	}
	public Static() {
		System.out.println("3");
	}
	public static void main(String[] args) {
		new b();
	}

}
class b extends Static{
	static{
		System.out.println("4");
	}
	public b(){
		System.out.println("5");
	}
	{
		System.out.println("6");
	}
}
