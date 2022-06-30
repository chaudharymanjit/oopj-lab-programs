package package4;



class shape{
	
	public void show() {
		System.out.println("this is super class");
	}
}
class circle extends shape{
	
	@Override
	 public void show() {
		
//		super.show();  // then both will be print
		System.out.println("this child class");
	}
}
class area extends circle{
	@Override
	
	public void show() {
//		super.show();  ///  doubt;
		System.out.println("this is grandchild class");
	}
}



//note: 1. overriding return type should same or if it is not equal then 
      //2. jo bhi parent class ka method hai uska return type child class ke method ke return type ka parent hona chahiye;



    public class overrid{
	public static void main(String args[]) {
		
		shape obj=new shape();
		 obj.show();
		 
		 circle obj1=new circle();
		 obj1.show(); /// see the result child show function override the parents shoe function;
		 
		 area obj2=new area();
		 obj2.show();
		
	}
	
	
}



