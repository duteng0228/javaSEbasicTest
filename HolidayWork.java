import java.util.*;

public class HolidayWork{
	public static void main(String[] args){
		// ʮ�Ľ׳�
		int j = 1;
		for(int i = 1;i<=10;i++){
			j = j * i;
		}
		System.out.println(j);
		
		// �ϲ�����
		int[] a = {1,7,9,11,13,15,17,19};
		int[] b = {2,4,6,8,10};
		int[] c = new int[a.length+b.length];
		System.arraycopy(a,0,c,0,a.length);
		System.arraycopy(b,0,c,a.length,b.length);
		Arrays.sort(c);// ����
		System.out.println(Arrays.toString(c));
		// С������
		double totalDistance = 0;
		double height = 100.0;
		for(int i=1;i<=10;i++){
			totalDistance += height;
			height = height/2;
			if(i<10){
				totalDistance += height;
			}
			if(i==10){
				System.out.println("��ʮ�η���"+height+"��");
			}
		}
		System.out.println("һ������"+totalDistance+"��");
		
		
		// ��
		for(int n=1;n<20;n++){
			for(int v=1;v<34;v++){
				for(int k=3;k<300;k+=3){
					if((n+v+k == 100) && (5*n+3*v+k/3 == 100)){
						System.out.println("��������"+n);
						System.out.println("ĸ������"+v);
						System.out.println("С������"+k);
						System.out.println("  ");
					}
				}
			}
		}
		// ����
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
		// ���ܴ���
		Scanner scanner = new Scanner(System.in);
		System.out.println("������һ����λ��");
		int x = scanner.nextInt();
		System.out.println("���ܺ������"+Efs(x));
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