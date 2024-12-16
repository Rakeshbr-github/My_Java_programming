package day11;

public class StudentMain {

	public static void main(String[] args) {
        
//		Student s=new Student();
		
//		assign data using object reference
/*		s.sid=271176;
		s.sname="Rakesh";
		s.grade='A';
		s.printstudata();
		*/
		
//		assign data by using user defined method
/*		s.setStuData(271176, "Rakesh", 'A');
		s.printstudata();
		*/
		
//		Using constructors
		Student s=new Student(271176,"Rakesh",'A');
             s.printstudata();		
	}

}
