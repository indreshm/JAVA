package classes_and_objects;

public class Student {
	String name;
	
//final data membaers can be intialized as soon as they are declared
    int rollNumber;
	
	// this constructor cant be used as this constructor not intialized rollNumber and conce create we can not assign rollNumber
	public Student(String n) {
		name=n;
	}
	
	public Student(String n, int rn) {
		name=n;
		rollNumber= rn;
	}
	//contructing a setter for rollNumber this is best because we can set condition or control the input
//	public void setRollNumber(int rn) {
//		if(rn<0) {
//			return;          //giving error after making rollNumber final as we cannot change rollNumber once intialize
//		}
//		rollNumber =rn;
//		
//	}
//	
	public int getRollNumber() {
		return rollNumber;
//	}
//	
	
	
	

}
