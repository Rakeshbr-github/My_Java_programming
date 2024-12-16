package day9;

import java.util.Arrays;

public class Mutable_and_Immutable {

	public static void main(String[] args) {
            int a[]= {23,30,10,60};
             int b[]=a;
             System.out.println(Arrays.toString(a));
              	Arrays.sort(a);
             System.out.println(Arrays.toString(a));
             System.out.println(Arrays.toString(b));
	}

}
