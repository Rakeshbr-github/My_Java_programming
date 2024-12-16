package day20;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Array_List {

	public static void main(String[] args) {
                    
//		Declaration
		ArrayList mylist=new ArrayList(); //For storing heterogeneous data
//      List mylist=new ArrayList();      //For storing heterogeneous data
//		ArrayList <String>mylist=new ArrayList<String>();  //For storing homogeneous data.
		
		
//		Adding data into ArrayList
		mylist.add(100);
		mylist.add(10.5);
		mylist.add("welcome");
		mylist.add('A');
		mylist.add(true);
		mylist.add(100);
		mylist.add(null);
		mylist.add(null);
		
		
//		SizeofArraylist
		System.out.println(mylist.size());  //8

//		Printing data from Arraylist
		System.out.println("Printing data from ArrayList:" +mylist);
		
//		Remove element from the arrayList
		mylist.remove(5);
		System.out.println(mylist);  //After removing
		
//		Insert a element into a Arraylist
		mylist.add(2, "Java");
		System.out.println(mylist);
		
//		Modify a element in arraylist
		System.out.println(mylist.set(2, "Python"));
		System.out.println(mylist );
		
		
//		To retrieve particular element from ArrayList
		System.out.println(mylist.get(2));
		
//		How to read all the elements from the ArrayList
		
//		1)Using normal for loop
/*		for(int i=0;i<=mylist.size()-1;i++)
		{
			mylist.get(i);
			System.out.println(mylist.get(i));
		}
		*/
		
//		2)Using Enhanced for loop
/*		for(Object x:mylist)
		{
			System.out.println(x);
		}
	*/
		
//		Using iterator to read data from ArrayList
           Iterator   it=mylist.iterator();	
    //       System.out.println(it.next());  //this will display only the first element in the arraylist
           
           while(it.hasNext())
           {
        	 System.out.println(it.next());  
           }
           
//           Checking ArrayList is empty or not 
           System.out.println("Is my ArrayList empty" + mylist.isEmpty());
           
           
//           To Remove multiple  elements from the ArrayList
           ArrayList mylist1=new ArrayList();
           mylist1.add(100);
           mylist1.add("welcome");
           
           mylist.removeAll(mylist1);
           System.out.println("After removing multiple elements " + mylist);
           
//           To clear All the elements from the ArrayList
           mylist.clear();
           System.out.println(mylist);
           System.out.println("Is my list empty After executing clear method: "+ mylist.isEmpty());
           
	}

}
