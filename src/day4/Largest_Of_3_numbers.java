package day4;

public class Largest_Of_3_numbers {

	public static void main(String[] args) {
            int a=10,b=90,c=150;
            if(a>b&&a>c) {
            	System.out.println(a+" is the largest of three numbers");
            }
            if(b>a&&b>c) {
            	System.out.println(b+" is the largest of three numbers");
            }
            else {
            	System.out.println(c+" is the largest of three numbers");
            }
	}

}
