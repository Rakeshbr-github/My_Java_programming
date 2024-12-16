package day7;

import java.util.Scanner;

public class Duplicates_in_array {

	public static void main(String[] args) {
             int a[]= {10,20,30,10,40};
             Scanner sc=new Scanner(System.in);
             System.out.println("Enter the number to search duplicates ");
             int num=sc.nextInt();
             int count=0;
     /*        for(int i=0;i<=4;i++) {
                    if(a[i]==num) {
                    	count++;
                    }
             }
     */  
//             enhance for loop
             for(int value:a) {
            	 if(value==num) {
                   count++;
            	 }
            	 
             }
             System.out.println("The number of duplicate entries for number " + num + " is : "+ count);

	}

}
