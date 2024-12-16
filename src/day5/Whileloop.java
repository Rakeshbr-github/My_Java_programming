package day5;

public class Whileloop {

	public static void main(String[] args) {
//           example 1 - print numbers one to ten
	/*	int a=1; //initialization
		while(a<=10) //condition
		{
			System.out.println(a);
			a++;
		}
	*/
//		example 2 - Print hello10 times
	/*	int a=1;
		while(a<=10)
		{
			System.out.println("Hello!");
			a++;
		}
		*/
		
//		example 3 -print even no between one to ten
	 // method 1	 
/*		int a=2;
		while(a<=10)
		{
			System.out.println(a);
			a=a+2;
		}
		*/
		//method 2 
	/*	int a=1;
		while(a<=10)
		{
			if(a%2==0)
			{
				System.out.println(a);
			}
			a++;
   		}
   		*/
		
//		example 4 --- to print odd numbers from 1 to 10
	/*	int a=1;
		while(a<=10)
		{
			if(a%2!=0)
			System.out.println(a);
			a++;
		}
		*/
		
//		example 5 - print 10 to 1 
		int a=10;
		while(a>=1)
		{
			System.out.println(a);
			a--;
		}
	}

}
