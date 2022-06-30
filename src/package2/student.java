package package2;
import java.util.*;

 class example {
	
	int roll;
	String name;
	char ch;
	double d;
	
	example(String str,int i,char c){
		
		this.name=str;
		this.roll=i;
		this.ch=c;
//		this.d=m;
	}
	
      void display() {
	   
   	   System.out.println("Name is:"+this.name);
	   System.out.println("roll number is:"+this.roll);
	   System.out.println("branch is:"+this.ch);
//	   System.out.println("phone number is:"+this.d);

   }

}

public class student{

public static void main(String args[]) {
	
	example obj =new example("ankr",060,'B');
	
	obj.display();
	
}
}


