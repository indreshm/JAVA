package functions;

public class DivideNumbers {
	
	public static int divideNumbers(int num,int deno){
		if(deno==0) {
			return Integer.MIN_VALUE;
		}
	//	System.out.println("Inside divedeNumbers function");
		return num/deno;
	}
	
	public static void printDivisionResult(int num,int deno) {
		if(deno==0) {
			//exit the function
			System.out.println("division by zero not allowed");
			return;
		}
		System.out.println(num/deno);
	}

	public static void main(String[] args) {
		int num=8;
		int deno=0;
/*		int result=divideNumbers(num,deno);
		System.out.println(result);   */
		printDivisionResult(num, deno);
	}

}
