import javax.swing.*;
import java.util.Random;

public class Demo{
	public static void main (String[] args){
		//char c = '��';
		//System.out.print(c);
		
		int age1 = 21;
		int age2 = 23;
		System.out.println(age1+age2);
		
		int num = 19;
		System.out.println("��������Ϊ:"+Integer.toBinaryString(num));
		System.out.println("�˽�����Ϊ:"+Integer.toOctalString(num));
		System.out.println("ʮ��������Ϊ:"+Integer.toHexString(num));
		
		long a = 12345678901L;
		System.out.println("long:"+a);
		float b = 3.1415926F;
		System.out.println("float:"+b);
		double c = 1234567890.987654321;
		System.out.println("double:"+c);
		
		char a1 = 97;
		System.out.println(a1);
		char a2 = '0';
		System.out.println((int)a2);
		// �����
		Random random = new Random();
		int letter = random.nextInt(26)+65;
		System.out.println((char)letter);
		//����̨����һ�������ƽ��
		Scanner scanner = new Scanner(System.in);
		int scannerNum = scanner.nextInt();
		System.out.println(scannerNum*scannerNum);
	}
}