package day3;

public class Operators {

	public static void main(String[] args) {
		
		
    
		//Arithmetic operators   + - * / %
		int a=60,b=10;
		int c= a+b;
		int d=a+c;
		System.out.println("Arithmetic operators");
		System.out.println(d);
		System.out.println("sum of a and b :" + (a+b));
		System.out.println(" difference of a and b :" + (a-b));
		System.out.println("mutiplication of a and b :" + (a*b));
		System.out.println(" division of a and b :" + (a/b));
		System.out.println(" modulo of a and b :" + (a%b));
		
		//Relational/comparison operators  >  >=  <  <=  !=  == 
//		returns boolean either true or false
		System.out.println();
		
		System.out.println("Relational/comparison operators");
       System.out.println(a>b);	
       System.out.println(a>=b);	
       System.out.println(a<b);
       System.out.println(a<=b);
       System.out.println(a!=b);
       System.out.println(a=b);  // variable assignment inside print stat
       System.out.println(a==b);
       System.out.println();
       
//      Logical operators   &&   ||  !
 // returns boolean values
 // works between two values
         boolean x=true;
         boolean y=false;
         System.out.println("Logical operators" );
       	System.out.println(x||y); // true
       	System.out.println(x&&y); //false
       	System.out.println(!x); //false
       	System.out.println(!y); //true
       	
       	boolean b1=10>20;
       	System.out.println(b1); //false
       	
       	boolean b2=30>40;
       	System.out.println(b2); // false
       	
       	System.out.println(b1 && b2); // false
       
       	System.out.println((10<20) && (20>10)); // true
       	
       	
       	
	}

}
