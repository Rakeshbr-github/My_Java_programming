package day4;

public class Nested_if_else {

	public static void main(String[] args) {
  /*  if(false) {
    	System.out.println(1);
    }
    else {
    	System.out.println(0);
    }
    */
		if(1==1) {
			if(2>2) {
				System.out.println("first statement executed");
			}
			else {
				if(3<4) {
					System.out.println("second statement executed");
				}
			}
		}
	}

		
}
