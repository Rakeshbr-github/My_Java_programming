package day10;

public class StudentMain {

	public static void main(String[] args) {
          Student st1=new Student();
           st1.sid=271176;
           st1.sname="Rakesh";
           st1.grad='A';
           st1.printStudentData();
           
//           creating object without a reference variable
           new Student();
/*           
           new Student().sid=271176;
           new Student().sname="Rakesh";
           new Student().printStudentData();
           */
	}

}
