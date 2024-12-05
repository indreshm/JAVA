package temp;

import java.util.Stacks;

import classes_and_objects.Student;
//     package name        class  which has to be import
public class StudentUse2 {

	public static void main(String[] args) {
		// giving erorr "Student can not be resolved at a type " this is because of different package to resolve this we have to import the student class
        Student s= new Student();   
       // giving error because of default access rollNumber is accessible in same package
        s.rollNumber = 123;
      // public accesible to everywhere
        
        Stack<Integer> stack = new Stack<>();
	}

}
