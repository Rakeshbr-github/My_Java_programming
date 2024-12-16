package day19;
//This code is giving improper output

import java.io.FileInputStream;
import java.io.IOException;

public class Checked_exception {

	public static void main(String[] args) throws IOException {
             System.out.println("The code has started...");
             System.out.println("The code is in progress...");
             
  /*           try {
				FileInputStream file=new FileInputStream("C:\Users\Rakesh B R\Desktop");
			} catch (FileNotFoundException e) {
				
				e.printStackTrace();
			}
			*/
             
             
	  FileInputStream file=new FileInputStream("C:\\Users\\Rakesh B R\\Desktop");

             System.out.println(file.read()); //file.read is to read data inside file
             
             System.out.println("...The code has completed");
             
             
	}

}
