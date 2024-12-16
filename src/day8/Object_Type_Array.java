package day8;

import java.util.Arrays;

public class Object_Type_Array {

	public static void main(String[] args) {
              Object a[]=new Object[5];
            a[0]=1;
              a[1]="Rakesh";
              a[2]=0.1;
              a[3]=true;
//              System.out.println(Arrays.toString(a));
              for(Object x:a) {
            	  System.out.println(x);
              }
	}

}
