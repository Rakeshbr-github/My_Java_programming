package day15;
//final class Test1
 class Test1{
//		final void m1() // we cannot override the same method again in this same class
	 void m1() 
	{
		System.out.println("This is a m1 from Test1");
	}
}

class Test2 extends Test1
{
	void m1() {
		System.out.println("this is m1 from Test2");
	}
}

public class Final_keyword2 {

	public static void main(String[] args) {
		Test2 t=new Test2();
		t.m1();
                
	}

}
