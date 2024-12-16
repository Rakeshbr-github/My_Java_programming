package day19;

public class Finally_Block {

	public static void main(String[] args) {
        
		String s="Rakesh";
		
		try
		{
		System.out.println(s.length());
		}
//		case1: Exception occured, catch block handled
//		case2: Exception occured, catch block NOT handled
//		case3: Exception does not occured, catch block ignored
	catch(ArithmeticException refv)
		{
			System.out.println("Exception is handled");
		}
		finally
		{
			System.out.println("Entered into finally block");
		}
	}

}
