package day8;

import java.util.Arrays;

public class StringMethods {


	public static void main(String[] args) {
//              String name="Rakesh";
//              String name=new String("Rakesh");
//              System.out.println("My name is "+ name);
               
//              Length() -Length of a string
//              String s="Rakesh";
//              int len=s.length();
//              System.out.println(len);
//              System.out.println(s.length());
              
//              concat() -- To join the strings
/*              String s1="Rakesh";
              String s2=" B R";
              String s3=" is a QA engineer";
              System.out.println(s1.concat(s2).concat(s3));
              */
		
//		trim()- Remove the spaces right  and left side 
//      		System.out.println(s.trim());

		 String s=" Rakesh";
		 String s1="BR";
		 
//		 chatAt()   to display char at specified index
//		 char g=s.charAt(8);
//		 System.out.println(g);
		 
//		 contains()  --- Checks if its a part of string or not 
//		 System.out.println(s.contains("R"));
		 
//		 equals(), equalsIgnoreCase() - COmpae two strings
/*		System.out.println(s1.equals("BR")); //true
		System.out.println(s1.equals("br")); //false casesensitive
		System.out.println(s1.equalsIgnoreCase("br")); // true
		*/
//		 replace() - replace a single/sequence of a character in a string
		 s="Welcome to java selenium";
//		 String rep=s.replace('e','R');
//		 System.out.println(rep);
//		 String  rep1=s.replace("Welcome", "Advance");
//		 System.out.println(rep1);
//		 System.out.println(s.substring(2,6)); //lcom
//		 System.out.println(s.substring(11,15)); //java
	
//		 toUppercase() to convert into uppercase
//		 System.out.println(s.toUpperCase());
//		 System.out.println(s.toLowerCase());
//   Example 1
/*		 s="abc@xyz";
		  String a[]=s.split("@");
		  System.out.println(a[0]);
		  System.out.println(a[1]);
		  */
//		 Example 2 
/*		 s="abc@gmail.com";
		 String a[]=s.split("@");
		 System.out.println(a[1]);
		 */
//		 Example 4
//		 String amount="$15,20,55";   //Expected output 152055
		  
//		System.out.println(amount.replace(",","").replace("$",""));

//		 Example 5
		 s="abc,123@xyz";  //expected output abc ,123, xyz
		 System.out.println(s.replace(","," ,").replace("@",", "));
		 String a[]=s.split(",");
		 System.out.println(Arrays.toString(a));
		 
		 
  	}



}
