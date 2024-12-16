package day19;

import java.util.Scanner;

public class ExceptionsDemo {

	public static void main(String[] args) {
		
		System.out.println("Program is started....");
                Scanner sc=new Scanner(System.in);
//                All the below exceptions are based on Unchecked exception
//                Example1
 /*               System.out.println("Enter the number");
                int num=sc.nextInt();
                System.out.println(100/num);   //Arithmetic exception
                */
                
//                Example2
/*               int a[]= new int[5];
                 System.out.println("Enter the position from 0-4");
                 int pos=sc.nextInt();
                 System.out.println("Enter the value:");
                 int value=sc.nextInt();
                 a[pos]=value;     //ArrayIndexOutOfBoundsException
                 System.out.println(a[pos]);
                 */
                
//                Example3
 /*               String s="welcome";    //NumberFormatException
                int num=Integer.parseInt(s);
                System.out.println(num);
               */
                
                
//                Example4
 /*               String s=null;                    //NullPointerException
                System.out.println(s.length()); 
                */
                
                
               
               
               
               
                
                System.out.println("The program is declined");
	}

}
