package day12;

public class Addermain {

	public static void main(String[] args) {
                Adder ad=new Adder();
                ad.sum(); //calling method1
                ad.sum(10.5, 10);// calling method 5
                ad.sum(11.5, 11.5); // method 3
                ad.sum(2, 3.5);// method4
                ad.sum(10, 20);// method 2
	}

}
