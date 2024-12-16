package day13;

public class ThisKeyword {

   int x,y; //class variable or instance variable 
// method1 while declaring different variable name   
/*   void setdata(int a,int b) {
	   x=a;
	   y=b;
   }
  */
   
//   method 2 while declaring same variable name "this" keyword should be used
   void setdata(int x,int y) {
	   this.x=x;
	   this.y=y;
   }
   
   void displaydata() {
	   System.out.println(x+"  "+ y);
   }
   
	public static void main(String[] args) {
            
		
		ThisKeyword th=new ThisKeyword();
		th.setdata(1, 2);
		th.displaydata();
	}

}
