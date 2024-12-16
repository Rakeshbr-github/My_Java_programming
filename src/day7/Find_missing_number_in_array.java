package day7;

public class Find_missing_number_in_array {

/*	* numbers should be in range
	* should not have duplicates
	* no need of sorting order */
	public static void main(String[] args) {
       int a[]= {1,2,4,5};
        int sum1=0;
        for(int i=0;i<=a.length;i++) {
        	sum1=sum1+a[i];
       }
        int sum2=0;
        for (int i=1;i<=5;i++) {
        	sum2=sum2+a[i];
        }   	
        System.out.println("The missing number is " +(sum2-sum1));
        	}
}     
  