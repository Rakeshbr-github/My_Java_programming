package day9;

public class StringVSStringBufferVSstringBuilder {

	public static void main(String[] args) {
//            String Immutable --- Cannot change
//		  String s="Welcome";
/*		  s.concat("to java");  //immutable it doest overwrite the existing value
		  s=s.concat("to java");
		  System.out.println(s);
		  */
//		  StringBuffer  --mutable, can change 
/*		  StringBuffer  s=new StringBuffer("Welcome ");
		  s.append("to java");  
		  System.out.println(s);
		  */
//		StringBuilder  -- mutable, can change 
		StringBuilder s=new StringBuilder("Weclome to ");
		s.append("java selenium");
		System.out.println(s);
		  
	}

}
