public class Work1{
	public static void main(String[] args){
		// ������
		int line = 5;
		for(int i=0;i<line;i++){
		for(int j=0;j<line;j++){
			System.out.print("*");
		}
		System.out.println();
		}
		// ����������
		int L = 5;
		for(int i=1;i<=L;i++){
			System.out.print("*");
			for(int j=1;j<=L;j++){
				if(i==1 || i==5 || j==5){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		// 99�˷���
		for(int i=1;i<=9;i++){
			for(int j=1;j<=i;j++){
				System.out.print(i+"*"+j+"="+(i*j)+" ");
			}
			System.out.println();
		}
		// ˮ�ɻ���
		int count = 0;
		for(int i=100;i<=999;i++){
			int b = i/100;
			int s = (i-b*100)/10;
			int g = i-b*100-s*10;
			if(i==g*g*g+s*s*s+b*b*b){
				System.out.print(i+" ");
				count++;
			}
		}
		System.out.println("ˮ�ɻ����ܹ��У�"+count+"��");
		
		// 1��100�ۼ�ֵ
		int sum = 0;
		for(int i=1;i<=100;i++){
			sum += i;
			if(i % 10 == 3){
				sum = sum - i;
			}
		}
		System.out.print(sum);
		
	}
}