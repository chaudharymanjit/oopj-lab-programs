package package3;


class location{
	 
	 String address;
	 int a=10;

	public  void maja() {
		 System.out.println("maja aa raha hai");
	 }
	location(){  // 
		System.out.println("this is default constructor");
	}
	
	
	location(String address){  // this is parametric constructor;
		
		this.address=address;
	}
 
}

class college extends location{
	 
	 int a=20;
	 
	public void show(int a) {
		 System.out.println(a); // output is 50 if we call show(50);
		 System.out.println(this.a); // output is 20; because this refer same class object(college);
		 System.out.println(super.a); // output is 10; because super refer parent class object(location);
		 
		 super.maja(); // we can also access method of parent class using super; 
	 }
	 
	 
	 
	 int no_of_student;
	 String name_of_college;
	 
	 
	 college(){
		 
		 super(); // default super call karo ya na karo koi fark nhi padta hai(kyuki default automatic call  kar leta hai);
		
		super.address="mysore";  // here address is access from parents class(location);
		this.no_of_student=50000;
		this.name_of_college="nie";
		 
	 }
	 college(int no_of_student,String name_of_college,String add){
		 
		 super(add);
		 
		 this.no_of_student=no_of_student;
		 this.name_of_college=name_of_college;

	 }
	  void display() {
		 System.out.println(no_of_student+" "+name_of_college+" "+address);
	 }
}






class student extends college{  // this is called multi-level inheritance;
	 
	 String name;
	 int roll;
	 float marks;
	 
	 student(String str,int i,float f,int no_of_student,String name_of_college,String add){
		 
		 super(no_of_student,name_of_college,add); // ye v likh sakte hai ya iske badle me niche jaise lika gaya hai use bhi likh sakte hai;
		 
//		 //
//		 super.no_of_student=no_of_student;
//		 super.name_of_college=name_of_college;
//		 super.address=add;

		 this.name=str;
		 this.roll=i;
		 this.marks=f;

		 
		 
	 }
	 
	 void display1() {
		 System.out.println("name is:"+name+" "+"roll is:"+roll+"  "+"marks is:"+marks+"  "+"no. of student:"+no_of_student+" "+"name of college:"+name_of_college);
	 }
	 
	 
	 
}



public class inheritance {
	public static void main(String args[]) {
		
		college obj=new college();
		obj.show(50);
		obj.display();

		
		college obj1=new college(10000,"IIT DELHI","delhi");
		obj1.display();

		student obj2=new student("ankur",10,7.75f,5000,"nie","mysore");
		obj2.display1();
		
		
		

	    
		
		
		
	}

}

