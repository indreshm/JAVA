package classes_and_object;
import java.util.Scanner;
public class StudentUse {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner s = new Scanner(System.in);
        Student s1 = new Student("Ankush", 123);
        //s1.name= "Ankush";
        //s1.setRollnumber(-123);
       // s1.rollNumber= 123;
        s1.print();
        Student s2 = new Student("Monisha",123);
        //s2.name= "Monisha";
        //s2.setRollnumber(121);
        //s2.rollNumber=121;
        s2.print();
        
//        System.out.println(s1.numStudents);
//        System.out.println(s2.numStudents);
        //System.out.println(Student.numStudents);
        System.out.println(Student.getNumStudents());
        
        
        
        System.out.println(s2.name);
        System.out.println(s1.name);
        
        System.out.println(s1.getRollNumber());
        
        //System.out.println(s1);
         
	}

}
