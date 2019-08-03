import java.util.Scanner;
public class Homework{
	public static void main(String[] args){
		// 练习一
		int num = 48;
		System.out.println((char)num);
		char a = '中';
		System.out.println((int)a);
		
		// 练习二
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入一个数：");
		double doubleNum = scanner.nextDouble();
		System.out.println(Math.pow(doubleNum,2)-2*doubleNum+4);
		
		// 练习三
		System.out.println(doubleNum%3);
		System.out.println(doubleNum++);
		
		// 练习四
		System.out.println("请输入数据条数：");
		int total = scanner.nextInt();
		int size = 10;
		int page = total%size==0 ? total/size : total/size+1;
		System.out.println(page);
		
		// 练习五
		System.out.println("请输入成绩：");
        int score = scanner.nextInt();	
		if(score > 100 || score < 0){
			System.out.println("super man");
		}else if(score >= 90 && score <= 100){
			System.out.println("优秀");
		}else if(score >= 80 && score < 90){
			System.out.println("良好");
		}else{
			System.out.println("不及格");
		}
		System.out.println("请输入一个数字：");
		// 练习六
		int Num = scanner.nextInt();
		while(Num != -1){
			System.out.println("您输入的数是："+Num);
		}
		System.out.println("您输入的数是-1，跳出循环");
		
		// 练习七
		System.out.println("请输入P1的横坐标：");
		int x1 = scanner.nextInt();
		System.out.println("请输入P1的纵坐标：");
		int y1 = scanner.nextInt();
		System.out.println("请输入P2的横坐标：");
		int x2 = scanner.nextInt();
		System.out.println("请输入P2的纵坐标：");
		int y2 = scanner.nextInt();
		double L = Math.sqrt(Math.pow((x1-x2),2)+Math.pow((y1-y2),2));
		System.out.println("p1和p2的距离是："+L);
		
	
	}
}