package ifelse;
import java.util.Scanner;

public class Largestof3 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		
		if (a>=b && a>=c) {
			System.out.println(a);
		} else {
			if (b>=c && b>=a) {
				System.out.println(b);
			} else {
				System.out.println(c);
			}
		} 
		
//		if (a>=b && a>=c) {
//			System.out.println(a);
//		}else if(b>=c && b>=a) {
//			System.out.println(b);
//		}else {
//			System.out.println(c);
//		}
	}

}
