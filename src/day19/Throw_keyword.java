package day19;

public class Throw_keyword {
	
	void checksum(int num)
	{
		if(num<1) {
			throw new ArithmeticException("Number is negative cannot calculate square");
		}
		else
		{
			System.out.println(num*num);
		}
	}
	

	public static void main(String[] args) {
		Throw_keyword tk=new Throw_keyword();
		try
		{
		tk.checksum(-1);
		}
	   catch(Exception refv)
		{
		   System.out.println("Input data is invalid");
		}

	}

}
