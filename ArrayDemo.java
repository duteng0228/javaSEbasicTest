import java.util.Arrays;

public class ArrayDemo{
	public static void main(String[] args){
		
		byte[] b = {0,5,6,9}; 
		System.out.println(b[2]);
		System.out.println(Arrays.toString(b));
		for(int i=0;i<b.length;i++){
			System.out.println(b[i]);
		}
		
		
		int[] num = {0,2,5,8};
		int[] num2 = num;
		System.out.println(Arrays.toString(num2));
		num [2] = 582;
		System.out.println(Arrays.toString(num2));
		
		
		int[] num = {0,2,5,8};
		int[] num2 = new int[num.length];
		for(int i=0;i<num.length;i++){
			num2[i] = num[i];
		}
		num[2] = 582;
		System.out.println(Arrays.toString(num));
		System.out.println(Arrays.toString(num2));
		
		int[] num = {0,2,5,8,9};
		int[] num2 = new int[4];
		System.arraycopy(num,0,num2,0,4);
		System.out.println(Arrays.toString(num2));
		
		int[] num3 = Arrays.copyOf(num,num.length+1);
		num3[5] = 252;
		System.out.println(Arrays.toString(num3));
		
	}
}