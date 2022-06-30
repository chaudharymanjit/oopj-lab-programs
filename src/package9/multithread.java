package package9;


class test extends Thread{
	
	public void show() {
		int i=0;
		while(i<10) {
			System.out.println("hi");
		}
	}
}



class test1 extends test
{
	
	public void show() {
		int i=0;
		while(i<10) {
			System.out.println("hey");
		}
	}
}
class test2 extends test1{
	
	public void show() {
		int i=0;
		while(i<10) {
			System.out.println("hi");
		}
	}
}



public class multithread {
	public static void main(String args[]) {
		
		test t=new test();
//		t.show();
		t.start();
		
		
		test t1=new test();
		t1.start();
		
		test t2=new test();
		t2.start();
		
		
	}

}
