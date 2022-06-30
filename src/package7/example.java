package package7;

import java.util.*;
public class example {
	public static void main(String args[]) {
		int arr[]=new int[5];
		
		System.out.println("enter you array\n");
		Scanner input=new Scanner(System.in);
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=input.nextInt();
		}
		int sum=0;
		for(int j=0;j<arr.length;j++) {
			System.out.println("element of the array is:\n"+arr[j]);
			sum=sum+arr[j];
		}
		System.out.println("sum of the array is:"+sum);
		
		
		
		
	}

}
