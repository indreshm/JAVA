package classes_and_objects;
import java.util.Scanner;
public class StudentUse {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
	// campare to scanner how we create  
		Student s1 = new Student();
		Student s2 = new Student();
		
// s1 and s2 is not the student its generally store address where student is which is created because of new keyword
		System.out.println(s1);
//	this is output "classes_and_objects.Student@6d03e736" which indicates the address of s1
        System.out.println(s2);
        
// 
        s1.name="Ankush";
       // s1.rollNumber=123;  // giving error because we make rollNumber private
        
        s1.setRollNumber(123);
        System.out.println(s1.getRollNumber());
        
        System.out.println(s1.name);
        System.out.println(s2.name);
        
	}

}
