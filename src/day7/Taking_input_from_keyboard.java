package day7;

import java.util.Scanner;

public class Taking_input_from_keyboard {

	public static void main(String[] args) {
//         int a=100; hardcoded value
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Please enter a value");
//	To take input for integer value	
/*		int a=sc.nextInt();
		System.out.println("Given input value is " + a);
		*/

//		To take decimal number as input
/*		double a=sc.nextDouble();
		System.out.println("Given input value is " + a);
		}
		*/

//		to take string input
		String a=sc.next();
		System.out.println("Given name is "+ a);

	}
}
