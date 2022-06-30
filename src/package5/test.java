package package5;

 interface student{
	
	void square();

}

 class arithmetic implements student{
	
	@Override
	
	public void square() {
		System.out.println("hello everyone");
	}
	
}
 
 class TestInt{
	 
	 
	 TestInt(){
		 
	 arithmetic  obj=new arithmetic();
	 obj.square();
	 }
	 
 }
 
 public class test{
	 public static void main(String args[]) {
		 
		 arithmetic a=new arithmetic();
		 
		 a.square();
		 
		 
	 }
 }
