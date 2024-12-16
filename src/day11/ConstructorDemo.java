package day11;

public class ConstructorDemo {
	int x,y;
		
	ConstructorDemo()  //default constructor 
	{
		x=10;
		y=20;
	}
	
	ConstructorDemo(int a,int b)  //parameterized  constructor 
	{
		x=a;
		y=b;
	}
	void sum() {
		System.out.println(x+y);
	}
	public static void main(String[] args) {
		
//		ConstructorDemo cd=new ConstructorDemo();
//		cd.sum();
  
		ConstructorDemo cd=new ConstructorDemo(2,3);
		cd.sum();
	}

}
