package day14;

 class A   //parent class
 {
	 int a;
	 void display() {
		 System.out.println(a);
	 }
 }

class B extends A    //child class
{
	int b;
	void show() 
	{
		System.out.println(a+b);
	}
}

class C extends B
{
	int c;
	void print()
	{
		System.out.println(a+b+c);
	}
}

public class Inheritance_Types {

	public static void main(String[] args) 
	{
//		1)(single inheritance)this is a object for child class 
/*         B b=new B(); 
          b.a=10;
          b.b=20;
          b.display();
          b.show();
          */
		C c=new C() ;
		c.a=1;
		c.b=2;
		c.c=3;
		c.print();
			
		
	}

}
