package day17;

public class Data_Conversion {

	public static void main(String[] args) {
		
//		Scenario 1:  String ---> int, double, bool, char (not possible)
//####################################################################################################	
//           String -->int
//		String s="welcome";  //cannot convert to number int data type 
		
	/*	String s1="10";
		String s2="20";
		 int sum=Integer.parseInt(s1)+Integer.parseInt(s2);
		System.out.println(sum);
		*/
		
		
//		String-->double;
/*		String s1="10.5";
		String s2="5.15";
		double sum=Double.parseDouble(s1)+Double.parseDouble(s2);
		System.out.println(sum);
		*/
		
//		String-->boolean
//		String s="welcome";  cannot convert this to boolean
/*		String s="true";
		boolean boolval=Boolean.parseBoolean(s);
		System.out.println(boolval);
		*/
		
//		String--char   this data conversion is not possible
//		String s="A";
//		Character.   
		
//		Scenario 2:  int, double, bool, char ----> String
//######################################################################################
		
/*		int x=100;
		double d=10.5;
		boolean v=true;
		char c='A';
		
		String s=String.valueOf(x);
		String s1=String.valueOf(d);
		String s2=String.valueOf(v);
		String s3=String.valueOf(c);
		System.out.println(s + " " + s1 +" "+ s2 + " "+ s3);
		*/
		
//		Scenario 3:  int-->double -> possible
/*		int x=10;
		double d=x;
		System.out.println(d);
		*/
		
//		Scenario 4: double to int -> not possible
		double d=10.095;
		int x=(int)d;
		System.out.println(x);
		
	}

}
