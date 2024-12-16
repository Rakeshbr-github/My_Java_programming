package day12;

public class Box {
      double width, height, depth;
      
      Box(){  //default constructor
    	/*  width=0;
    	  height=0;
    	  depth=0;
    	  */
    	  
    	  width=height=depth=0;		 
      }
//      below are parameterized constructor
      Box(double w,double h,double d){
    	  width=w;
    	  height=h;
    	  depth=d;
      }
      Box(double len){
    	  width=height=depth=len;
    	  }
//	  method
	  
	  double volume() {
		  return (width*height*depth);
      }

}