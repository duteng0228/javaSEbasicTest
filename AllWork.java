import java.util.*;
public class AllWork{
	public static void main(String[] args){
		String str = "ͳ��һ���ַ����ַ����е�����λ��";
		Scanner scanner = new Scanner(System.in);
		System.out.print("������Ҫ�����֣�");
		String word = scanner.next();
		char first = word.charAt(0);
		// ����һ������
		int[] pos = {};
		for(int i = 0;i<str.length();i++){
			char ch = str.charAt(i);
			if(ch == first){
				pos = Arrays.copyOf(pos,pos.length+1);// ��������
				pos[pos.length-1] = i;
			}
		}
		System.out.println(Arrays.toString(pos));
		
		// ��ϰ��
		char[] chs = {'ͳ','��','һ','��','��','��','��','��','��','��','��'};
		System.out.print("�������ַ���");
		String con = scanner.next();
		char content = con.charAt(0);
		for(int i=0;i<chs.length;i++){
			if(chs[i] == content){
				System.out.println("���ֵ�λ��"+i);
			}
		}
		// �ַ���ͳ�ư���
		String s = "123456789012";
		int c1 = 0;
		int c2 = 0;
		for(int i=0;i<s.length();i++){
			if(i%2 == 0){
				c1 += s.charAt(i) - '0';
			}else{
				c2 += s.charAt(i) - '0';
			}
		}
		System.out.println(c1);
		System.out.println(c2);
		// ������ת
		String num = "56123";
		StringBuffer stringBuffer = new StringBuffer(num);
		StringBuffer stringBuffer2 = stringBuffer.reverse();
		String str2 = stringBuffer2.toString();
		int num1 = Integer.parseInt(str2);
		System.out.println(num1);
		
		// ������
		for(int i = 0;i<9;i++){
			for(int j = 0;j<9;j++){
				System.out.print(" *");
			}
			System.out.println();
		}
		// ����������
		for(int i=0;i<9;i++){
			for(int j=0;j<9;j++){
				if(i == 0 || i == 8){
					System.out.print(" *");
				}else{
					if(j == 0 || j == 8){
						System.out.print(" *");
					}else{
						System.out.print("  ");
					}
				}
			}
			System.out.println();
		}
		// �žų˷���
		
		for(int i=1;i<=9;i++){
			for(int j=1;j<=i;j++){
				System.out.print(i+"*"+j+"="+(i*j)+"\t");
			}
			System.out.println();
		}
		// �ϲ�����
		int[] a = {1,7,9,11,13,15,17,19};
		int[] b = {2,4,6,8,10};
		int[] c = new int[a.length+b.length];
		System.arraycopy(a,0,c,0,a.length);
		System.arraycopy(b,0,c,a.length,b.length);
		System.out.println(Arrays.toString(c));
		// ˮ�ɻ�
		int Num = 0;
		for(int i = 100;i<1000;i++){
			Num = (int)Math.pow(i/100,3)+(int)Math.pow(i/10%10,3)+(int)Math.pow(i%10,3);
			if(i == Num){
				System.out.println(Num);
			}
		}
		// ����
		System.out.println("��������������");
		int Number = scanner.nextInt();
		int frist = Number/1000;
		int sec = Number/100%10;
		int tirth = Number/10%10;
		int forth = Number%10;
		frist = (frist+5)%10;
		sec = (sec+5)%10;
		tirth = (tirth+5)%10;
		forth = (forth+5)%10;
		int result = forth*1000+tirth*100+sec*10+frist;
		System.out.println("���ܺ������"+result);
	}
}