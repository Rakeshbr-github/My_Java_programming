package day18;

// upcasting/widener -- converting data type from smaller to higher
// int ---> long 
// float -->double

// downcasting/narrowing -- converting data type from higher to smaller
// long -->byte
// long -->int 

public class Typecasting {

	public static void main(String[] args) {
                     
//		1)upcasting -->automatic --smaller to larger 
		
/*		int intval=100;
		long longvalue=intval;
		System.out.println(longvalue);
		*/
	 
/*		float floatval=10.5f;
		double doubleval=floatval;
		System.out.println(doubleval);
*/		
		
//		1)downcasting -->manual -- larger to smaller
		
/*		long longval=100000;
		int intval=(int)longval;   //downcasting
*/
		
/*		double doubval=125.55 ;
		float floatval=(float)doubval;
*/
		
//		example1
		int i=100;
		double value=i;    //upcasting
		System.out.println(value);
		
		
//		example 2 
		double d=112.5;
		int j=(int)d;   //downcasting
		 System.out.println(j);
	}

}
