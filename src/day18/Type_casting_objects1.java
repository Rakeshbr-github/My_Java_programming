package day18;

class Animal{}

class Dog extends Animal{}
class Cat extends Animal{}

public class Type_casting_objects1 {

	public static void main(String[] args) {
                 
//		Animal an=new Animal();
		
//		Rule 1: Conversion is valid or not --either casting type should have parent to child 
//		or child to parent relation ship with created object
//		Animal d=new Dog();
//		Cat c=(Cat) d;   valid as per rule 1
		
//		Dog d=new Dog();
//		Cat c=(Cat) d;  not valid as per rule 1
		
//		Rule 2: assignment is valid or not 
//		C must be either same or child of A	
//		Animal an= new Dog();
//		Cat ct=(Cat) an;  //valid as per rule 2	
//		Animal an=new Dog();
//		Cat ct=(Dog) an; invalid as per rule 2
		
//	Rule 3:The underlying object of d must be either same or child of c
//		Animal an= new Dog();
//		Cat ct=(Cat) an; //invalid as per Rule 3
		
		
//		 Rule1,Rule2,Rule3
		Animal an=new Dog();
		Dog dg=(Dog) an;  //Rule1-Yes   Rule2-Yes  Rule3-Yes
		
		
	}

}
