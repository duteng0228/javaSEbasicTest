import java.util.*;

public class HolidayWork{
	public static void main(String[] args){
		// 十的阶乘
		int j = 1;
		for(int i = 1;i<=10;i++){
			j = j * i;
		}
		System.out.println(j);
		
		// 合并数组
		int[] a = {1,7,9,11,13,15,17,19};
		int[] b = {2,4,6,8,10};
		int[] c = new int[a.length+b.length];
		System.arraycopy(a,0,c,0,a.length);
		System.arraycopy(b,0,c,a.length,b.length);
		Arrays.sort(c);// 排序
		System.out.println(Arrays.toString(c));
		// 小球问题
		double totalDistance = 0;
		double height = 100.0;
		for(int i=1;i<=10;i++){
			totalDistance += height;
			height = height/2;
			if(i<10){
				totalDistance += height;
			}
			if(i==10){
				System.out.println("第十次反弹"+height+"米");
			}
		}
		System.out.println("一共经过"+totalDistance+"米");
		
		
		// 买鸡
		for(int n=1;n<20;n++){
			for(int v=1;v<34;v++){
				for(int k=3;k<300;k+=3){
					if((n+v+k == 100) && (5*n+3*v+k/3 == 100)){
						System.out.println("公鸡数："+n);
						System.out.println("母鸡数："+v);
						System.out.println("小鸡数："+k);
						System.out.println("  ");
					}
				}
			}
		}
		// 完数
		int i,k;
		int num = 0;
		for(i = 1;i<=1000;i++){
			num = 0;
			for(k = 1;k<i;k++){
				if(i%k == 0){
					num += k;
				}
			}
			if(i == num){
				System.out.println(i);
			}
		}
		// 加密传递
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入一个四位数");
		int x = scanner.nextInt();
		System.out.println("加密后的数字"+Efs(x));
	}
	public static int Efs(int x){
			int a = x/1000;
			int b = x%1000/100;
			int c = x%100/10;
			int d = x%10;
			a = (a+5)%10;
			b = (b+5)%10;
			c = (c+5)%10;
			d = (d+5)%10;
			x = 1000*d+c*100+b*10+a;
			return x;
	}
}