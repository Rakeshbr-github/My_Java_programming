package day12;

public class Overload_main_method {

//	main method 1
	void main(int a) {
		System.out.println(a);
	}
//	main method 2
	 void main(int a, int b) {
		System.out.println("sum :"+ (a+b));
	}

//	main method 3
	public static void main(String[] args) {
		Overload_main_method ov=new Overload_main_method();
		ov.main(100);
		ov.main(100, 200);
	}

}
