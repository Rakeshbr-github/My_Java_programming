package day11;

public class Greetings {
//	1)no params no value
	 void m1()
	 {
		 System.out.println("Helloo..");
		
	 }
	 
//	 2)no params return value
	 String m2() {
		 return("Hell o");
		 
	 }
//	 3)take params no return value
	 void m3(String name) {
		 System.out.println("Hello " +name);
	 }
//	 4)Takes params take return value

     String m4(String name) 
     {
    	 return("Hello "+ name);
     }

}
