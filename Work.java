import java.util.Arrays;

public class Work{
	public static void main(String[] args){
		// ��ϰһ
		//String str = "ͳ��һ���ַ��������ַ��е�����λ��";
		//int[] num = countAll(str,'��');
		//System.out.println(Arrays.toString(num));
		
		// ��ϰ��
		char[] chs = {'ͳ','��','һ','��','��','��','��','��','��','��','��'};
		for(int i=0;i<chs.length;i++){
			if(chs[i] == '��'){
				System.out.println("�ֳ��ֵ�λ��"+i);
			}
		}
		// ��ϰ��
		String str1 = "123456789012";
		int c1 = 0;
		int c2 = 0;
		for(int i=0;i<str1.length();i++){
			if(i%2 == 0){
				c1 += str1.charAt(i) - '0';
			}else{
				c2 += str1.charAt(i) - '0';
			}
		}
		System.out.println("������Ϊ��"+c1);
		System.out.println("ż����Ϊ"+c2);
		
		// ��ϵ��
		int Num = 561235;
		int newNum = 0;
		while(Num>0){
			newNum = newNum * 10+Num % 10;
			Num = Num / 10;
		}
		System.out.println(newNum);
	}
	
	
	
	
	
	
	/*
	public static int[] countAll(String str,char ch){
		int[] num = {};
		for(int i=0;i<str.length();i++){
			char c = str.charAt(i);
			System.out.println(c);
			if(c == ch){
				num = Arrays.copyOf(num,num.length+1);
				num[num.length-1] = i;
			}
		}
		return num;
	}
	*/
}