package day7;

public class Number_of_even_odd_numbers {

	public static void main(String[] args) {
             int a[]= {1,2,3,4,5,6,7};	
                int even=0;
                int odd=0;
                for(int i=0;i<7;i++) {
                	if(a[i]%2==0) {
                		even++;
                	}
                	else {
                		odd++;
                	}
                }
                System.out.println("The number even numbers in array are " + even);
                System.out.println("The number of odd numbers in a array are " + odd);
            		 }

}
