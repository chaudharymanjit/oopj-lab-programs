package package1;

import java.util.*;

public class factorial {
	
public static void main(String args []) {
	
	Scanner in=new Scanner(System.in);
	
	System.out.println("Enter the number");
	int n=in.nextInt();
		
	int	ans=1;
		
		for(int i=1;i<=n;i++) {
			
			ans=ans*i;
			
		}
		
		System.out.println("factorial of the number is:" +ans);
	}

}
