
public class fibonacci {
	
	public static int fib(int n) {
		
		//base case
		if(n==0||n==1) {
			return n;
		}
		return fib(n-1)+fib(n-2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fib(2));
		

	}

}