import java.util.Scanner;
public class factorial {
    
	
	//check sorted using recursion
	public static boolean checkSorted(int input[]) {
		//base case
		if(input.length<=1) {
			return true;
		}
		
		int smallInput[] = new int[input.length-1];
		
		for(int i=1;i<input.length;i++) {
			smallInput[i-1] = input[i];
		}
		
		boolean smallAns = checkSorted(smallInput);
		
		if(!smallAns) {
			return false;
		}
		if(input[0]<=input[1]) {
			return true;
		}
		else {
			return false;
		}
	}
	
	//better as we first check  0 and 1 pos first before smallInput
	
	public static boolean checkSorted_2(int input[]) {
		if(input.length<=1) {
			return true;
		}
		if(input[0]>input[1]) {
			return false;
		}
		
		int smallInput[] = new int[input.length-1];
		for(int i =1;i<input.length;i++) {
			smallInput[i-1]=input[i];
		}
		
		boolean smallAns = checkSorted_2(smallInput);
		
		return smallAns;
		
	
	}
	
	//check sorted array better
	public static boolean checkSortedBetter(int input[], int startIndex) {
		if(startIndex==input.length-1) {
			return true;
		}
		if(input[startIndex]>input[startIndex+1]) {
			return false;
		}
		boolean smallAns = checkSortedBetter(input, startIndex+1);
		return smallAns;
	}
	
	public static boolean checkSortedBetter(int input[]) {
		return checkSortedBetter(input,0);
	}
	
	
	public static int fact(int n) {
		
		if(n==0) {
			return 1;
		}
		
		int ans = n * fact(n-1);
		return ans;
	}
	
	public static int fibo(int n) {
		if(n==0||n==1) {
			return n;
		}
		
		return fibo(n-1)+fibo(n-2);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
//		int n = s.nextInt();
//        System.out.println(fact(n));
//        
//        System.out.println(fibo(n));
		
		int arr[] = {0,1,10,6,9};
		System.out.println(checkSorted(arr));
		
		System.out.println(checkSorted_2(arr));
		
		System.out.println(checkSortedBetter(arr,0));
		System.out.println(checkSortedBetter(arr));
		
		
		
	}
	


}
