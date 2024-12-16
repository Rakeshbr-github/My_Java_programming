package day6;

public class Odd_even_numbers_in_array_2 {

	public static void main(String[] args) {
          int a[]= {1,2,3,4,5,6};
          
          System.out.println("Even numbers in the array are ......");
          for(int i=0;i<a.length;i++) {
        	  if(a[i]%2==0) {
        		  System.out.println(a[i]);
        	  }
        	   }
          System.out.println("Odd numbers in the array are ......");
   	           for(int i=0;i<a.length;i++) {
   	        	  if(a[i]%2!=0) {
   	        		  System.out.println(a[i]);  
   	           }
          }
	
        		  
        		  }

}
