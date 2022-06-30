package package4;



class anything {
	
	int sum(int a,int b) {
		return a+b;
	}

	int sum(int i,int j,int k){  // this is method overloading;
		return i+j+k;
	}
	
	void show(int a) {
		System.out.println("int a");
	}
	void show(float a,String str) {
			
		System.out.println("float and string");
	}
	
}

public class overload {
	public static void main(String args[]) {
		
		
		anything obj=new anything();
		
//		System.out.println(obj.sum(10, 20));
		
		System.out.println(obj.sum(1,2,3));
		
		int c=obj.sum(10, 20);
		System.out.println(c);
		

		obj.show(5);
		obj.show('A');   // this is also execute because of type casting;
//		obj.show("abc",10); error(because string and integer is not there);
		obj.show(10.0f,"abc");
		obj.show(10,"abc");  // here 10 is integer but it is execute because of type casting;;
		



		
	}

}

