package day7;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Sorting_elements_inarray {

	public static void main(String[] args) {
            int a[]= {4,2,1,5,3};
//            using in built in functions
  /*          System.out.println("Before sorting "+ Arrays.toString(a));
            Arrays.sort(a);
            System.out.println("After sorting " + Arrays.toString(a));
            */
            System.out.println("Before sorting " + Arrays.toString(a));
            int n=a.length;
            for(int i=0;i<=n-1;i++) //for number of passes
            {
            	for(int j=0;j<=n-1-1;j++){
            		if(a[j]>a[j+1]) 
            		{
            		int temp=a[j];
            		a[j]=a[j+1];
            		a[j+1]=temp;
            		}
            	}
            		}
            System.out.println("After sorting " + Arrays.toString(a));
            		}

}
