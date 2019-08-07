import java.util.*;

public class Itembank{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入一个数：");
		int num = scanner.nextInt();
		int sum = 0;
		sum = num/100+num/10%10+num%10;
		System.out.println("该数的和为："+sum);
		// 练习一
		System.out.println("输入一个数：");
		int x = scanner.nextInt();
		if(x%2 == 0){
			System.out.println("输入的数值是偶数");
		}
		System.out.println("您输入的数："+x);
		// 练习二
		System.out.println("输入第一个数：");
		int x1 = scanner.nextInt();
		System.out.println("输入第二个数：");
		int y1 = scanner.nextInt();
		int z = x1>y1 ? x1 : y1;
		System.out.println(z);
		
		// 练习三
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
		//奖金
		System.out.println("输入当月利润为：");
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
		// 成绩
		System.out.println("请输入成绩：");
		int a = scanner.nextInt();
		String lever;
		switch(a/10){
			case 9:lever = "A";break;
			case 8:lever = "B";break;
			case 7:lever = "C";break;
			case 6:lever = "D";break;
			default:lever = "E";
		}
		System.out.println("你的成绩等级"+lever);
		// 年薪
		int money = 30000;
		int moneysum = 0;
		for(int c=1;c<=10;c++){
			moneysum += money;
			money += money*0.06;
		}
		System.out.println("十年后的年薪"+moneysum);
		// 猴子
		int n = 1;
		for(int m= 1;m<=9;m++){
			n = (n+1)*2;
		}
		System.out.println(n);
		// 输出
		System.out.println("输入一个数为：");
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
		// 判断
		System.out.println("输入一个数为：");
		int Nb = scanner.nextInt();
		if(Nb%5 == 0 && Nb%6 == 0){
			System.out.println("该数可以被5和6整除");
		}else if(Nb%5 == 0 && Nb%6 != 0){
			System.out.println("该数可以被5整除");
		}else if(Nb%5 != 0 && Nb%6 == 0){
			System.out.println("该数可以被6整除");
		}else{
			System.out.println("该数不可以被5和6整除");
		}
	}
}