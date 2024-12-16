package day5;

public class Jumping_statements_break_continue {

	public static void main(String[] args) {
 /*          for(int i=1; i<=10; i++) {
        	   if(i==5){
        		 break;  
        	   }
        	   System.out.println(i);
           }
           */
//	 to skip value 3 	
/*		for(int i=1; i<=10; i++) {
      	   if(i==3){
      		 continue;  
      	   }
      	   System.out.println(i);
         }
	*/	
//	to skip value 3 4 and 7
		for(int i=1; i<=10; i++) {
	      	   if(i==3 || i==4 || i==7){
	      		 continue;  
	      	   }
	      	   System.out.println(i);
	}
	}
}
