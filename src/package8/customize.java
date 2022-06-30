package package8;

 class test extends Exception {
	
	test(String s){
		super(s);
	}
	
	public class customize{
		public static void main(String args[]) {
			
			try {
				
			   throw  new test("ankur");
			}
			catch(test t) {
			
				System.out.println(t.getMessage());
			}
			
		}
	}
	
	
	
	

}
