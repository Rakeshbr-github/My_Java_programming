package day3;

public class AssigmentSwappingOfTwoNumbers {

	public static void main(String[] args) {
		int a=10,b=20;
		//my logic
         /*   
            int res=(a>b)?a:b;
            System.out.println("value of a is:"+res);
            int res1=(a<b)?a:b;
            System.out.println("value of b is :"+res1);
        */
		System.out.println("Before swapping the value of a is:"+a+ " Value of b is:"+b);
		b=a+b-(a=b);
		System.out.println("After swapping a:"+a+ " Value of b :"+b);
	
	}

}
