package day18;

// A b=(C) d;

public class Type_casting_object3 {

	public static void main(String[] args) {
		
//		Ex1
//		Object o=new String("Welcome");
//		StringBuffer sb=(StringBuffer) o;  //Rule1-Pass Rule2-Pass  Rule3-Failed
		
//		Ex2
//		String s=new String("welcome");
//		StringBuffer sb=(StringBuffer) s;  //Rule1- Failed
		
//		Ex3
//		Object o=new String("welcome");
//		StringBuffer sb=(StringBuffer) o;  //Rule1- Pass  Rule2- Pass 
		
//		Ex4
//		Object o=new String("welcome");
//		StringBuffer sb=(String) o;   //Rule1-passed  Rule2-failed
		
//		Ex5
//		String s=new String("welcome");
//		StringBuffer sb=(String) s;    //Rule1-passed Rule2-failed
	
//		Ex6
//		Object o=new String("welcome");
//		StringBuffer sb=(StringBuffer) o; //Rule1-Passed Rule2-Passed  Rule3-Failed
		
//		Ex7
		Object o=new String("welcome");
		String s=(String) o; //Rule1-passed Rule2-passed Rule3-passed 
		
                   
	}

}
