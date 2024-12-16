package day14;

class ABC
{
	
}
 class XYZ
 {
	 
 }


public class Test {

	public static void main(String[] args) {
		 ABC obj=new ABC();
//		 obj.    you can access methods here from ABC class eventhough we have not created any method inside that class
         XYZ obj1=new XYZ();
//         obj1.  same methods can be accessed by this class as well
//         so there is a ambiguity between each class by default so we cannot extend multiple class from child class
         
         
		 
	}

}
