package day12;

public class Call_by_reference {

	public static void main(String[] args) {
        Test test=new Test();
        test.number=100;
        System.out.println("value before method:"+test.number);
        test.m2(test);
        System.out.println("value after method"+test.number);
	}

}
