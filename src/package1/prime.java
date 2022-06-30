package package1;

import java.util.*;

public class prime {
	public static void main(String args[]) {
		
		System.out.println("enter the number\n");
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int count=0;
		
		if(n<=1) {
			System.out.println("number in not prime");
		}
		else {
			for(int i=2;i<n;i++) {
				if(n%i==0) {
			
				System.out.println("number is not prime");
				break;
				}
				else {
					System.out.println("Number is prime");
					break;
				}
			}
	
		}

		
		
		
	}

}
