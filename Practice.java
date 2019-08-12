import java.util.Scanner;

public class PracTice{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		int getResult = getSum(num1,num2);
		System.out.println(getResult);
		System.out.println(getMistake(num1,num2));
		System.out.println(getPlus(num1,num2));
		System.out.println(getDivision(num1,num2));
		
	}	
		
	public static int getSum(int num1,int num2){
		int result = num1+num2;
		return result;	
	}
	public static int getMistake(int num1,int num2){
		int result1 = num1-num2;
		return result1;
	}
	public static int getPlus(int num1,int num2){
		int result2 = num1*num2;
		return result2;
	}
	public static int getDivision(int num1,int num2){
		int result3 = num1/num2;
		return result3;
	}
}