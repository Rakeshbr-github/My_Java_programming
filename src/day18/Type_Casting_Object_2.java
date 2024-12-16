package day18;
 
class Parentclass
{
	String name="Rakesh";
	void m1()
	{
		System.out.println("This is m1 method of parent class....");
	}
}

class Childclass extends Parentclass
{
	int id=2239;
	void m2()
	{
		System.out.println("This is m1 method of child class....");
	}
}

public class Type_Casting_Object_2 {

	public static void main(String[] args) {
             
/*		Childclass c=new Childclass();
		System.out.println(c.name);
		c.m1();   //parent
		c.m2();   //child
		System.out.println(c.id);
		*/
		
/*		Parentclass p=new Childclass();   //upcasting
		System.out.println(p.name);
		p.m1();
//		p.m2(); even though object is created for a child it can access 
//		only for parent because reference variable is a parent
 */
		
		Parentclass p=new Parentclass();
		Childclass c=(Childclass)p;        //downcasting
		System.out.println(c.name);
		System.out.println(c.id);
		c.m1();
		c.m2();
	}

}
