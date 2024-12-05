package functions;
public class PrimeToN {
	
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
	
	public static void printPrimes(int n) {
		for(int i=2;i<=n;i++) {
			//need to check i is prime
			boolean isIprime= isprime(i);
			if(isIprime) {
				System.out.println(i);
			}
		}
	}
	
	
	public static void main(String[] args) {
		printPrimes(100);
		System.out.println("back in main");
	}

}
