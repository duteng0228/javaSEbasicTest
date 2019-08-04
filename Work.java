import java.util.Arrays;

public class Work{
	public static void main(String[] args){
		// 练习一
		//String str = "统计一个字符串在在字符中的所在位置";
		//int[] num = countAll(str,'字');
		//System.out.println(Arrays.toString(num));
		
		// 练习二
		char[] chs = {'统','计','一','个','字','符','在','字','符','串','中'};
		for(int i=0;i<chs.length;i++){
			if(chs[i] == '字'){
				System.out.println("字出现的位置"+i);
			}
		}
		// 练习三
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
		System.out.println("奇数和为："+c1);
		System.out.println("偶数和为"+c2);
		
		// 联系四
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