package day6;

public class Twodimensional_array {

/*
  1) Declare an array
2) add values into array
3) Find size of an array
4) read single value from an array
5) read multiple values from an array
 */
	public static void main(String[] args) {

//		delclaration
//		approach 1
		int a[][]= new int[3][2];  // 3 roes and 2 column
		
//		adding values into array
		a[0][0]=100;
		a[0][1]=200;
		
		a[1][0]=300;
		a[1][1]=400;
		
		a[2][0]=500;
		a[2][1]=600;
		
//		approach 2
/*		int a[][]= {{100,200},{300,400},{500,600}};
		System.out.println();
		*/
//		Find size of an array
//		System.out.println(a.length); // returns only number of rows
//		System.out.println(a[0].length); //number of column in specific rows
//		read single value from column
//		System.out.println(a[1][1]);
		
//		reading data from 2d array
	/*	for(int i=0;i<=2;i++)
		{
			for(int j=0;j<=1;j ++) {
				System.out.println(a[i][j]);
			}
			*/
//		or
/*		for(int i=0;i<=a.length-1;i++)
		{
			for(int j=0;j<=a[i].length-1;j ++) {
				System.out.print(a[i][j]+ "  ");
			}
			System.out.println();
			*/
//			enhanced for loop 
		for(int arr[]:a) {
			for(int x:arr) {
				System.out.print(x + " ");
			}
			System.out.println();
		}
		}
	}
	
	
	


