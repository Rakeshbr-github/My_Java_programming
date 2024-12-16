package day12;

//passing copy of the variable
public class Call_by_value {

	public static void main(String[] args) {
         Test test=new Test();
       int  number=500;
       System.out.println("Before calling method:"+number);
        test.m1(number);
        System.out.println("After calling the method:"+number);
	}

}
