package package6;



public class checked {
	public static void main(String args[]) {
		
		
		int a=10;
		
		try {
			int c=a/0;
		}
		catch(ArithmeticException e) {
			
			System.out.println(e.getMessage());
			throw e;
		}
		
	}

}
