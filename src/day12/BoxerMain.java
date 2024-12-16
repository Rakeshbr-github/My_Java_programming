package day12;

public class BoxerMain {

	public static void main(String[] args) {
//          Box b=new Box(); //calling default constructor
          Box b=new Box(1.2,2.2,3.2);
          System.out.println(b.volume());
	}

}
