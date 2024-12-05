package ifelse;
import java.util.Scanner;
public class evenodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int rem = n%2;
		if (rem==0) {
			System.out.println("Even");
			return;
		}
//		else {
//			System.out.println("odd");
	   // }
		System.out.println("odd");
		
		
	}

}
