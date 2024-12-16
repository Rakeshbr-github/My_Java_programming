package day19;

import java.util.Scanner;

public class Handle_Exception {

	public static void main(String[] args) {
		
		System.out.println("The program is started...");
		 Scanner sc=new Scanner(System.in);
                    
//Example2
 /*     System.out.println("Enter the number");
      int num=sc.nextInt();
      
      try
      {
      System.out.println(100/num);   //Arithmetic exception
      }
      catch(ArithmeticException refv)
      {
    	  System.out.println("Invalid data provided");
    	  System.out.println(refv.getMessage());  //gives some detailsof exception caused by
      }
  */	
		 
//       Example2
         int a[]= new int[5];
        System.out.println("Enter the position from 0-4");
        int pos=sc.nextInt();
        System.out.println("Enter the value:");
        int value=sc.nextInt();
        try
        {
        a[pos]=value;     //ArrayIndexOutOfBoundsException
        System.out.println(a[pos]);
        }
        catch(ArrayIndexOutOfBoundsException refv)
        {
        	System.out.println("Exceeding memory decalred");
        	System.out.println(refv.getMessage());
        	
        }
      
      
      System.out.println("The program is declined....");
      
		
		
	}

}
