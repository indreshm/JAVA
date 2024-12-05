package classes_and_object;
 
public class Student {
 	public String name;
	private final int rollNumber;
    
	private static int numStudents;
	
	public static int getNumStudents() {
		return numStudents;
	}
	
	public Student(String name, int rollNumber) {
		this.name = name;
		this.rollNumber = rollNumber;
		numStudents++;
	}
	
//	public void setRollnumber(int rn) {
//		//rollNumber = rn;
//		if(rn<=0) {
//			return;
//		}
//	}
	public int getRollNumber() {
		return rollNumber;
	}
	
	public void print() {
		System.out.println(name+":"+rollNumber);
	}
}
