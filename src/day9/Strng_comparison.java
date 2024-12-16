package day9;

public class Strng_comparison {

	public static void main(String[] args) {
//		case1
/*              String s1="welcome";
              String s2="welcome";
            	System.out.println(s1==s2);
            	System.out.println(s1.equals(s2));
            	*/
//		case 2
/*		String s1=new String("welcome");
				String s2=new String("welcome");
				
				System.out.println(s1==s2);   // Used for comparing objects
				System.out.println(s1.equals(s2)); //Used for comparing values
	*/
//		case 3
/*		String s1="abc";
		String s2=new String("abc");
		System.out.println(s1==s2);
        System.out.println(s1.equals(s2));		
        */
//		case 4
		String s1="abc";
		String s2=new String("abc");
		String s3=s2;
		System.out.println(s1==s2); //false
		System.out.println(s1.equals(s2)); //true
		System.out.println(s2==s3);  //true because the whole object is assigned to s3
		System.out.println(s2.equals(s3)); //true
				
	}

}
