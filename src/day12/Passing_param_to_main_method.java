package day12;

import java.util.Arrays;

public class Passing_param_to_main_method {

	public static void main(String[] a) {
//                   System.out.println(Arrays.toString(a));
		for(String x:a) {
			System.out.println(x);
//			to find length of an array
		}
		System.out.println("Number of strings in a array "+ a.length);

	}

}
