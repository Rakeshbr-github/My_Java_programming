package day16;

public class Multiple_Inheritance implements I1,I2
{
	
	public void m1()
	{
		System.out.println("This is m1");
	}
	
	public void m2()
	{
		System.out.println("This is m2");
	}

	public static void main(String[] args) {
		Multiple_Inheritance mi=new Multiple_Inheritance();
		mi.m1();
		mi.m2();
		
		System.out.println(mi.x);
		System.out.println(mi.y);
      
	}

}
