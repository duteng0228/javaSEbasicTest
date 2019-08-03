import java.util.Scanner;

public class Interest{
	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入您要存的年数");
		int year = scanner.nextInt();
		double base = 7.7/100;
		double rate = 0;
		if(year<=1){
			rate = base*0.5;
		}else if(year<=3 && year>1){
			rate = base*0.7;
		}else if(year<=5 && year>3){
			rate = base;
		}else{
			rate = base*1.1;
		}
		System.out.println("实际的利率"+rate);
		
		// 练习八
		String str = "692116851128";
		int oldNum = 0;
		int evenNum = 0;
		int Sum = 0;
	    for(int i=0;i<str.length();i++){
			if(i%2 == 0){
				oldNum += str.charAt(i) - '0';
			}else{
				evenNum += str.charAt(i) - '0';
			}
		}
		Sum = oldNum + evenNum*3;
		System.out.println("奇数和为"+oldNum);
		System.out.println("偶数和为"+evenNum);
		System.out.println(Sum);
		int result = Sum % 10;
		System.out.println(result);
		int resultFive = 10 - result;
		System.out.println(resultFive);
		int answer = resultFive % 10;
		System.out.println(answer);
	}
}