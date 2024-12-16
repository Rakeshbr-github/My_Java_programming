package day6;

public class Sum_ofno_in_array_1 {

	public static void main(String[] args) {

//		int a[]=new int[6];
		int a[]= {1,2,3,4,5,6};
		int sum=0;
/*		for(int i=0;i<=5;i++) {
		
			sum=sum+a[i];
		
		}
		System.out.println("The sum of the numbes inside the array is" 
				+" " +  sum);
		*/
		for(int x:a) {
			sum=sum+x;
		}
		System.out.println(sum);
	}

}
