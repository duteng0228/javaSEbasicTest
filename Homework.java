import java.util.Scanner;
public class Homework{
	public static void main(String[] args){
		// ��ϰһ
		int num = 48;
		System.out.println((char)num);
		char a = '��';
		System.out.println((int)a);
		
		// ��ϰ��
		Scanner scanner = new Scanner(System.in);
		System.out.println("������һ������");
		double doubleNum = scanner.nextDouble();
		System.out.println(Math.pow(doubleNum,2)-2*doubleNum+4);
		
		// ��ϰ��
		System.out.println(doubleNum%3);
		System.out.println(doubleNum++);
		
		// ��ϰ��
		System.out.println("����������������");
		int total = scanner.nextInt();
		int size = 10;
		int page = total%size==0 ? total/size : total/size+1;
		System.out.println(page);
		
		// ��ϰ��
		System.out.println("������ɼ���");
        int score = scanner.nextInt();	
		if(score > 100 || score < 0){
			System.out.println("super man");
		}else if(score >= 90 && score <= 100){
			System.out.println("����");
		}else if(score >= 80 && score < 90){
			System.out.println("����");
		}else{
			System.out.println("������");
		}
		System.out.println("������һ�����֣�");
		// ��ϰ��
		int Num = scanner.nextInt();
		while(Num != -1){
			System.out.println("����������ǣ�"+Num);
		}
		System.out.println("�����������-1������ѭ��");
		
		// ��ϰ��
		System.out.println("������P1�ĺ����꣺");
		int x1 = scanner.nextInt();
		System.out.println("������P1�������꣺");
		int y1 = scanner.nextInt();
		System.out.println("������P2�ĺ����꣺");
		int x2 = scanner.nextInt();
		System.out.println("������P2�������꣺");
		int y2 = scanner.nextInt();
		double L = Math.sqrt(Math.pow((x1-x2),2)+Math.pow((y1-y2),2));
		System.out.println("p1��p2�ľ����ǣ�"+L);
		
	
	}
}