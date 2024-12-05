package for_loops;
import java.util.Scanner;
public class firstNnaturalnumber {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n= s.nextInt();
		int sum=0;
		//using while loop
		/*int i=1;
		while(j<=n) {
			sum=sum+i;
			i++;
		}
		System.out.print(sum);*/
		
		//using for loop
		for( int i=1;i<=n;i=i+1 ) {
			sum=sum+i;
		}
		System.out.println(sum);
	}
}
