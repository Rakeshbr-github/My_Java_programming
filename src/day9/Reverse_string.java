package day9;

import java.util.Scanner;

public class Reverse_string {

	public static void main(String[] args) {

//        Method1 -length(),chatAt()
 /*       for(int i=s.length()-1;i>=0;i--) {
        	rev=rev+s.charAt(i);
        }
        System.out.println(rev);
        */
        
//        Method2 - convert string into char array
/*        char a[]=s.toCharArray();
        System.out.println(Arrays.toString(a)); //[s, e, l, e, n, i, u, m]
        for(int i=a.length-1;i>=0;i--) {
        	rev=rev+a[i];
        }
        System.out.println(rev);
        */
        
//        Method 3 using user input
/*        System.out.println("Enter the string to be reversed ");

        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        String rev="";
        for(int i=name.length()-1;i>=0;i--) {
        	rev=rev+name.charAt(i);
        }
        System.out.println(rev);
        */
		
//		Method 4 using string buffer
		String r="welcome";
		StringBuffer s=new StringBuffer("welcome");
		System.out.println(s.reverse());
	}

}
