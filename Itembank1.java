import java.util.*;

public class Itembank1{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("��������ݣ�");
		int y = scanner.nextInt();
		if(y%400 == 0){
			System.out.println("����������");
		}else if(y%4 == 0 && y%100 != 0){
			System.out.println("����������");
		}else{
			System.out.println("���겻������");
		}
	}
}