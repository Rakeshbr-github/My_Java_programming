package day11;

public class Student {
    int sid;
    String sname;
    char grade;
//method 1    
    void printstudata()
    {
    	System.out.println(sid+" "+sname+" "+grade );
    }
//   method 2 
    void setStuData(int id,String name,char g) 
    {
    	sid=id;
    	sname=name;
    	grade=g;
    }
    
//    Constructor
//    Constructor will never return a value;
//    constructor name should be same as class;
//  Constructor will never return void also;
    
    Student(int id,String name,char g){
    	sid=id;
    	sname=name;
    	grade=g;
    }
    
}
