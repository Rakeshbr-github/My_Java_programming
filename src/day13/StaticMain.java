package day13;

public class StaticMain {


	public static void main(String[] args) {
		int a=11;
		  
    System.out.println(StaticDemo.a);  //this static method is not s part of same class
    StaticDemo. m1();                  //if we specify class name its possible to access static from other class directly 
		   StaticDemo sc=new StaticDemo(); //by creating object it can be accessed
//		   sc.m2();
		sc.m(); 

	}
}
