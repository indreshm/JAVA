package functions;
import java.util.Scanner;
public class functionNcR {	
	public static int factorial(int n) {
		int ans=1;
		for(int i=1; i<=n; i++) {
			ans=ans*i;
		}
		return ans;
	}	
	public static boolean isprime(int n) {
		int d=2;
		while(d<n) {
			if(n%d == 0) {
				return false;
			}
			d++;
		}
		return true;
	}
	public static void printTillN(int n) {
		//if -ve no. enter
		if(n<=0) {
			return;
		}
		
		for(int i=1;i<=n;i++) {
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		 Scanner s= new Scanner(System.in);
		 int n = s.nextInt();
		 int r= s.nextInt();
		 
		 ansN =printTillN(6);
		 System.out.println(ansN);
		 
		 boolean ansPrime=isprime(13);
		 System.out.println(ansPrime);
		 
		 int num= factorial(n);   // n!		
		 int den1= factorial(r);   //r!
		 int den2=factorial(n-r);   // (n-r)!
 
		 int NcR = num/(den1*den2);
		 System.out.println(NcR);	 
	}

}
