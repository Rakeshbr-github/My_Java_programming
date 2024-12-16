package day12;

public class Test {
         
	int number; //class variable no used in this code
	void m1(int number){ //local variable
		number=number+1;
		System.out.println("Value of the the number:"+number);
	}
	
	void m2(Test t) {
		t.number=t.number+1;
		System.out.println("value in the method:"+t.number);
	}
	
	
}
