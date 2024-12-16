package day15;


public class Animal {

	String color="white";
	void eat() {
		System.out.println("eating...");
	}
	
	Animal(){
		System.out.println("Animal!");
	}
	Animal(String name){
		System.out.println(name);
	}
}
	class Dog extends Animal
	{
		String color="black";
		
		void displaycolor() 
		{
		System.out.println(super.color);

		}
		
		void eat()
		{
//			System.out.println(super."eating bread");
		super.eat();
		}
		
		Dog(){
//			if I wont give and instructions inside child constructor by default parent class constructor will be invoked in main method
//			super(); invokes parent class constructor
//			System.out.println("Dog is the animal");
		}
		Dog(String name){
			super(name);
		}
	}

