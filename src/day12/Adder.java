package day12;

public class Adder {
        int a=10, b=20;
//        method1
        void sum() {
        	System.out.println(a+b);
        }
//        method2
        void sum(int x,int y) {
        	System.out.println(x+y);
        }
//        method3
        void sum(double x,double y) {
        	System.out.println(x+y);
        }
//        method4
        void sum(int x,double y) {
        	System.out.println(x+y);
        }
//        method5
        void sum(double y, int x) {
        	System.out.println(y+x);
        }
}
