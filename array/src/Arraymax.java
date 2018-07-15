import java.util.Scanner;
public class Arraymax {
	public static int minValue(int[] arr) {
		int min=arr[0];
		for(int i=0;i<arr.length;i++) {
				if(min>arr[i])
					min=arr[i];
		}
		return min;
	}
	public static int maxValue(int[] arr) {
		int max=arr[0];
		for(int i:arr) {
			if(max<i)
				max=i;
		}
		return max;
	}

	public static void main(String[] args) {
		int[] arr= {19,32,100,5,33,53,52,12};
		System.out.println("최대값 : "+maxValue(arr));
		System.out.println("최소값 : "+minValue(arr));		
		
		
		

	}

}
