import java.util.*;

public class Itembank1{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入年份：");
		int y = scanner.nextInt();
		if(y%400 == 0){
			System.out.println("今年是闰年");
		}else if(y%4 == 0 && y%100 != 0){
			System.out.println("今年是闰年");
		}else{
			System.out.println("该年不是闰年");
		}
	}
}