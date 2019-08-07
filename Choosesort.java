import java.util.*;

public class Choosesort{
	public static void main(String[] args){
		// —°‘Ò≈≈–Ú
		int[] a = {-8,56,20,1,88};
		for(int i=0;i<a.length-1;i++){
			for(int j=i+1;j<a.length;j++){
				if(a[i] > a[j]){
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
		
		
		
		int[] b = {56,-1,999,54,3};
		for(int i=0;i<b.length-1;i++){
			for(int j=i+1;j<b.length;j++){
				if(b[i] > b[j]){
					int temp = b[i];
					b[i] = b[j];
					b[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(b));
		// √∞≈›≈≈–Ú
		int[] num = {-8,56,20,1,88};
		int[] newarr = bubbleSort(num);
		System.out.println(Arrays.toString(newarr));
	}
	public static int[] bubbleSort(int[] arr){
		for(int i=0;i<arr.length-1;i++){
			for(int j=0;j<arr.length-1-i;j++){
				if(arr[j] > arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		return arr;
	}
}