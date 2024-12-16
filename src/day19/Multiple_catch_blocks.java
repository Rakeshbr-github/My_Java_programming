package day19;

import java.util.Scanner;

public class Multiple_catch_blocks {

	public static void main(String[] args) {
		System.out.println("Program is started....");
        Scanner sc=new Scanner(System.in);
        
        String s=null;                    //NullPointerException
// Example1 Using multiple catch blocks       
        try
        {
        System.out.println(s.length()); 
        }
/*        catch(ArithmeticException refv)
        {
        	System.out.println("Handled Airthmetic exception");
        }
        catch(NullPointerException refv)
        {
        	System.out.println("Handled NullPointerException");
        }
        catch(NumberFormatException refv)
        {
        	System.out.println("Handled NumberFormatException ");
        }
        */
        catch(Exception e)
        {
        	System.out.println("Exception handled");
        	System.out.println(e.getMessage());
        }
        
        System.out.println("The program is declined");

	}

}
