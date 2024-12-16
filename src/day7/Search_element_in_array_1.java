package day7;

import java.util.Scanner;

public class Search_element_in_array_1 {

	public static void main(String[] args) {
          int a[]= {10,20,30,40};
//  without declaring search number         
/*     for(int i=0;i<3;i++) {
    	  if(a[i]==30) {
    		  System.out.println("The search number given is " + a[i]);
    	  }
      }
      */
//          declaring search number variable
/*         int search_num=30;
          for(int i=0;i<3;i++) {
        	  if(search_num==a[i]) {
        		  System.out.println("The search number given is " + search_num);
        	  }
        	  }
        	  */

//          Using user input scanner class
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter the search number");
          int search_num=sc.nextInt();
          boolean status=false;
          
          for(int i=0;i<=4;i++) {
        	  if(search_num==a[i]) {
        		  System.out.println("The search number given is " + search_num);
        		  status=true;
        		  break;
        	  }
          }
        	  if(status==false) {
        		  System.out.println("Element not found ");
        		  
        	  }
          
          
	}

}
