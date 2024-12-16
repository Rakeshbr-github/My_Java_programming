package day13;

public class StaticDemo {
	static int a=10;   //static variable
	int b=20;  // non-static variable 
	
	 static void m1() //static method
	 {
		 System.out.println("This is m1 static method:");
	 }
	  void m2() //non-static method
	 {
		 System.out.println("This is m2 static method:");
	 }
	 void m() //non-static method can access every type of method directly
	 {
		 System.out.println(a+b);
		 m1();
		 m2();
	 }
	 

	public static void main(String[] args) {
		  
		System.out.println(a);  //static variable can be accessed by static method without creating object
	m1();                   //static method can be accessed by static method without creating object
//        m2();   // non-static method cannot be accessed by this method without creating  object because its non-static
		   StaticDemo sc=new StaticDemo(); //by creating object it can be accessed
//		   sc.m2();
		sc.m(); 

	}
	

}
