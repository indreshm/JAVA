package functions;
import java.util.Scanner;
public class NcR {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n= s.nextInt();
		int r= s.nextInt();
		
		int num= 1;   // n!
		for(int i=1; i<=n; i++) {
			num = num*i;
		}
		
		int den1=1;   //r!
		for(int i=1;i<=r;i++) {
			den1=den1*i;
		}
		
		int den2=1;   // (n-r)!
		for(int i=1; i<=(n-r); i++) {
			den2=den2*i;
		}
		
		int NcR = num/(den1*den2);
		System.out.println(NcR);
	}
}
