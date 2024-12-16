package day20;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
             
//		Declaration
		HashSet myset=new HashSet();
//	     Set myset=new HashSet();	
//		HashSet <String>myset=new HashSet<String>();
		
//		Adding data into Hash Set
		myset.add(100);
		myset.add(10.5);
		myset.add("welcome");
		myset.add('A');
		myset.add(100);
		myset.add(null);
		myset.add(null);
		System.out.println(myset);
		
//		size of an HashSet
		System.out.println(myset.size());
		
//		Printing HashSet
		System.out.println(myset);
		
//		Removing element from the hashSet
		myset.remove(10.5);  //only Defined value in the HashSet can be removed as because its no indexed
		System.out.println("After removing "+ myset);
		
//		Inserting element into HashSet - Not possible
//		Accessing specific element -Not possible --But there is s work around by using ArrayList
		
		
//		Convert HashSet-->ArrayList
		ArrayList a1=new ArrayList(myset);
		System.out.println(a1);
		System.out.println(a1.get(2));
		
//		Read all the elements using enhanced for loop
/*		for(Object x:myset)
		{
			System.out.println(x);
		}
		*/
		
//		Using iterator
		 Iterator it=myset.iterator();
		
		 while(it.hasNext())
		 {
			 System.out.println(it.next());
		 }
		 
//		 /Clearing all the elements in the HashSet
		 myset.clear();
		 System.out.println(myset);
	}

}
