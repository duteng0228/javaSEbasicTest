import java.util.*;
public class AllWork{
	public static void main(String[] args){
		String str = "统计一个字符在字符串中的所有位置";
		Scanner scanner = new Scanner(System.in);
		System.out.print("请输入要检查的字：");
		String word = scanner.next();
		char first = word.charAt(0);
		// 定义一个数组
		int[] pos = {};
		for(int i = 0;i<str.length();i++){
			char ch = str.charAt(i);
			if(ch == first){
				pos = Arrays.copyOf(pos,pos.length+1);// 扩容数组
				pos[pos.length-1] = i;
			}
		}
		System.out.println(Arrays.toString(pos));
		
		// 练习二
		char[] chs = {'统','计','一','个','字','符','在','字','符','串','中'};
		System.out.print("请输入字符：");
		String con = scanner.next();
		char content = con.charAt(0);
		for(int i=0;i<chs.length;i++){
			if(chs[i] == content){
				System.out.println("出现的位置"+i);
			}
		}
		// 字符串统计案例
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
		// 整数反转
		String num = "56123";
		StringBuffer stringBuffer = new StringBuffer(num);
		StringBuffer stringBuffer2 = stringBuffer.reverse();
		String str2 = stringBuffer2.toString();
		int num1 = Integer.parseInt(str2);
		System.out.println(num1);
		
		// 正方形
		for(int i = 0;i<9;i++){
			for(int j = 0;j<9;j++){
				System.out.print(" *");
			}
			System.out.println();
		}
		// 空心正方形
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
		// 九九乘法表
		
		for(int i=1;i<=9;i++){
			for(int j=1;j<=i;j++){
				System.out.print(i+"*"+j+"="+(i*j)+"\t");
			}
			System.out.println();
		}
		// 合并数组
		int[] a = {1,7,9,11,13,15,17,19};
		int[] b = {2,4,6,8,10};
		int[] c = new int[a.length+b.length];
		System.arraycopy(a,0,c,0,a.length);
		System.arraycopy(b,0,c,a.length,b.length);
		System.out.println(Arrays.toString(c));
		// 水仙花
		int Num = 0;
		for(int i = 100;i<1000;i++){
			Num = (int)Math.pow(i/100,3)+(int)Math.pow(i/10%10,3)+(int)Math.pow(i%10,3);
			if(i == Num){
				System.out.println(Num);
			}
		}
		// 加密
		System.out.println("请输入您的数：");
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
		System.out.println("加密后的数字"+result);
	}
}