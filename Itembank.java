import java.util.*;

public class Itembank{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("������һ������");
		int num = scanner.nextInt();
		int sum = 0;
		sum = num/100+num/10%10+num%10;
		System.out.println("�����ĺ�Ϊ��"+sum);
		// ��ϰһ
		System.out.println("����һ������");
		int x = scanner.nextInt();
		if(x%2 == 0){
			System.out.println("�������ֵ��ż��");
		}
		System.out.println("�����������"+x);
		// ��ϰ��
		System.out.println("�����һ������");
		int x1 = scanner.nextInt();
		System.out.println("����ڶ�������");
		int y1 = scanner.nextInt();
		int z = x1>y1 ? x1 : y1;
		System.out.println(z);
		
		// ��ϰ��
		int sum1 = 0;
		int i = 1;
		while(i<=100){
			sum1 += i;
			i++;
		}
		System.out.println(sum1);
		
		int sum2 = 0;
		int j = 1;
		while(j<=100){
			sum2 += j;
			j += 2;
		}
		System.out.println(sum2);
		
		int sum3 = 0;
		int k = 1;
		do{
			sum3 += k;
			k++;
		}while(k<=100);
		System.out.println(sum3);
		//����
		System.out.println("���뵱������Ϊ��");
		int profit = scanner.nextInt();
		double bonus = 0;
		if(profit<=10){
			bonus = profit * 0.1;
		}else if(profit>10 && profit<=20){
			bonus = (profit-10) * 0.075;
		}else if(profit>20 && profit<=40){
			bonus = (profit-20) * 0.05;
		}else if(profit>40 && profit<=60){
			bonus = (profit-40) * 0.03;
		}else if(profit>60 && profit<=100){
			bonus = (profit-60) * 0.015;
		}else{
			bonus = (profit-100) * 0.01;
		}
		System.out.println(bonus);
		// �ɼ�
		System.out.println("������ɼ���");
		int a = scanner.nextInt();
		String lever;
		switch(a/10){
			case 9:lever = "A";break;
			case 8:lever = "B";break;
			case 7:lever = "C";break;
			case 6:lever = "D";break;
			default:lever = "E";
		}
		System.out.println("��ĳɼ��ȼ�"+lever);
		// ��н
		int money = 30000;
		int moneysum = 0;
		for(int c=1;c<=10;c++){
			moneysum += money;
			money += money*0.06;
		}
		System.out.println("ʮ������н"+moneysum);
		// ����
		int n = 1;
		for(int m= 1;m<=9;m++){
			n = (n+1)*2;
		}
		System.out.println(n);
		// ���
		System.out.println("����һ����Ϊ��");
		int Num = scanner.nextInt();
		if(Num == 1){
			System.out.println("Num="+Num);
		}else if(Num == 5){
			System.out.println("Num="+Num);
		}else if(Num == 10){
			System.out.println("Num="+Num);
		}else{
			System.out.println("Num=none");
		}
		// �ж�
		System.out.println("����һ����Ϊ��");
		int Nb = scanner.nextInt();
		if(Nb%5 == 0 && Nb%6 == 0){
			System.out.println("�������Ա�5��6����");
		}else if(Nb%5 == 0 && Nb%6 != 0){
			System.out.println("�������Ա�5����");
		}else if(Nb%5 != 0 && Nb%6 == 0){
			System.out.println("�������Ա�6����");
		}else{
			System.out.println("���������Ա�5��6����");
		}
	}
}