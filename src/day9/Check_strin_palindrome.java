package day9;

public class Check_strin_palindrome {

	public static void main(String[] args) {
         String s1="madam";
         String palin="";
         for(int i=s1.length()-1;i>=0;i--) {
        	 palin=palin+s1.charAt(i);
         }
         if(s1.equals(palin)) {
        	 System.out.println("Given string "+ s1 + "is a palindrom string");
         }
         else {
        	 System.out.println("Not palindrome string");
         }
	}

}
