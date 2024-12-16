package day6;

import java.util.Arrays;

/*
 1) Declare an array
2) add values into array
3) Find size of an array
4) read single value from an array
5) read multiple values from an array
 */
public class Singledimensionalarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*		approach 1
       int a[]=new int[5];
       a[0]=10;
       a[1]=20;
       a[2]=30;
       a[3]=40;
       a[4]=50;
       */
		
//		approach 2
	 int a[]= {10,20,30,40,50,60};
//	 to find size of an array 
//	 System.out.println(a.length);
	 
//	 read single values from a array
//	 System.out.println(a[4]);
//	 read multiple values from array
//	 System.out.println(Arrays.toString(a)); to print entire array in single shot
	 
	 
/*	 classic for loop
	 for(int i=0;i<=4;i++) {
		 System.out.println(a[i]);
		 */
	 
/*	 or 
	 for(int i=0;i<a.length;i++) {
		 System.out.println(a[i]);
		 */
	 
//	 Enhanced for loop
	 for(int x:a) {
		 System.out.println(x);
	 }
	 }
		 
	}


