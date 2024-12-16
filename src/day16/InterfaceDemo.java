package day16;

interface shape
{
	int length=10; //final and static
	 int width=20; //final and static
	 
	 void circle(); //Abstract method
	 
	 default void square()
	 {
		 System.out.println("This is a default method...");
	 }
	 
	 static void rectangle()
	 {
		 System.out.println("This is static method..");
	 }
}

public class InterfaceDemo implements shape
{
	
	public void circle()   // visibility of a method should not be lesser than the parent interface
	{
		System.out.println("This circle is a abrstract method..");
	}

	void triangle()
	{
		
	}
	
	
	public static void main(String[] args) {
		
//		Scenario 1 
		InterfaceDemo obj=new InterfaceDemo();
		obj.circle(); //abstract
		obj.square(); //default method in parent we can class
		shape.rectangle();   //static method 
		
		System.out.println(shape.length+shape.width);
		System.out.println(obj.length+obj.width); // static variable is common across all the objects
		
//		Scenario 2
		shape sh=new InterfaceDemo();
		sh.circle();
		sh.square();
		shape.rectangle();
                     
	}

}
