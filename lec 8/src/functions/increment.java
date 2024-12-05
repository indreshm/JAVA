package functions;

public class increment {
	
	public static void increment(int n) {
		n =n+1;
		System.out.println(n);
	}

	public static void main(String[] args) {
		int a= 10;
		increment(a);
		System.out.println(a);
	}

}
