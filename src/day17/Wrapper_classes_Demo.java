package day17;

public class Wrapper_classes_Demo {

	public static void main(String[] args) {
//		primitive variable
              	int i=10; 
              	double d=10.5;
              	char c='A';
              	boolean b=true;
              	
//            Converting primitives to object type --Autoboxing 
              	System.out.println("Converting primitives to object type --Autoboxing");

              	Integer intobj=i;  
              	Double dobj=d;
              	Character cobj=c;
              	Boolean bobj=b;
              	System.out.println(intobj);
              	System.out.println(dobj);
              	System.out.println(cobj);
              	System.out.println(bobj);
                System.out.println();

//              Converting object to primitive type --Unboxing
              	System.out.println("Below Converting object to primitive type --Unboxing");
              	int intvalue=intobj;
              	double dobvalue=dobj;
              	char charvalue=cobj;
              	boolean boolvalue=bobj;
              	System.out.println(intvalue);
              	System.out.println(dobvalue);
              	System.out.println(charvalue);
              	System.out.println(boolvalue);
              	
              System.out.println();
              
//              int x=100;
              Integer x=100;
              
              
              
              	
	}

}
