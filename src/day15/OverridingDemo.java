package day15;

class Bank
{
	double roi(){
		return 0;
		
	}
}
class ICICI extends Bank
{
	double roi(){
		return 10.5;
		
	}
}

class SBI extends Bank
{
	double roi(){
		return 20.5;
		
	}
}


public class OverridingDemo {

	public static void main(String[] args) {
            	Bank obj=new Bank();
            	System.out.println(obj.roi());
 
            	ICICI obj1= new ICICI();
            	System.out.println(obj1.roi());
            	
            	SBI obj2= new SBI();
            	System.out.println(obj2.roi());
	}

}
