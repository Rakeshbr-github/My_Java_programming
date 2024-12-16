package day14;

class Parent
{
	void display(int a) {
		 System.out.println(a);
	}
}

class child1 extends Parent
{
	void show(int b) {
		System.out.println(b);
	}
} 

class child2 extends Parent
{
	void show(int c) {
		System.out.println(c);
	}
}
public class Hierarchy_inheritance {
	public static void main(String[] args) {

		child1 c1=new child1(); //object 1 for accessing child 1
		c1.display(10);
		c1.show(20);
		
		child2 c2=new child2();
		c2.display(10);
		c2.show(30);
	}

}
