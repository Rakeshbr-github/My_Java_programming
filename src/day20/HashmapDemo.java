package day20;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashmapDemo {

	public static void main(String[] args) {
                  
//		decalaration
//		Map my=new HashMap();
//		HashMap hm=new HashMap();
		HashMap <Integer,String>hm1=new HashMap<Integer,String>();
		
//		Adding pairs
		hm1.put(101, "6d");
		hm1.put(101, "Netcracker"); //Replaces 6d with netcracker duplicate value are not feasible
		hm1.put(103,"Moenegage");
		hm1.put(104,"Mobily infotech");
		hm1.put(104,"Mobileum");
		
		
		System.out.println(hm1); 
		
//		Removing pairs
		hm1.remove(104);  //104 key value value will be removed
		System.out.println(hm1);
		
//		Access value of the key
		System.out.println(hm1.get(101));
		
//		to get all values from hashmap
		System.out.println(hm1.keySet());  //return only key set [101, 103]
		System.out.println(hm1.values());  //returns only values  [Netcracker, Moenegage]
		System.out.println(hm1.entrySet());  //returns keys along with values [101=Netcracker, 103=Moenegage]
		
//		Reading data fromhash map using loopingstatement
		for(int k:hm1.keySet())
		{
			System.out.println(k +" "+hm1.get(k));
		}
		System.out.println();
		
//		Using iterator
		Iterator<Entry<Integer,String>> it=hm1.entrySet().iterator();
		while(it.hasNext())
		{
			Entry<Integer,String> entry=it.next();
			System.out.println(entry.getKey() + " " +entry.getValue());
		}
		
		
//		To clear  everything from Hash map
		hm1.clear();
		System.out.println(hm1);
		
	}

}
