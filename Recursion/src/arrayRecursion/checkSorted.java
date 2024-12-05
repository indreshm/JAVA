package arrayRecursion;

public class checkSorted {
	
	public static boolean checkSorted(int input[]) {
		
		if(input.length<=1) {
			return true;
		}
		
		if(input[0]>input[1]) {
			return false;
		}
		
		int smallinput[]= new int[input.length-1];
		
		for(int i=1;i<input.length;i++) {
			smallinput[i-1]=input[i];
		}
		
		boolean smallAns=checkSorted(smallinput);
		
		return smallAns;
		
		
	}
	
	
	public static boolean checkSortedBetter(int input[], int startIndex) {
		// this function checks the array is sorted from start index
		if(startIndex==input.length-1) {   //base case 
			return true;  // allindexes are checked and return
		}
		
		// check from start
		if(input[startIndex]>input[startIndex+1]) {
			return false;
		}
		
//		boolean smallAns=checkSortedBetter(input, startIndex+1);
//		return smallAns;
		
		return checkSortedBetter(input, startIndex+1);
		
	}
	
	public static boolean checkSortedBetter(int input[]) {
		return checkSortedBetter(input,0);
	}

	
	public static int sumArray(int input[]) {
		//base case
		if(input.length==0) {
			return 0;
		}
		if(input.length==1) {
			return input[0];
		}
		
		int smallInput[]=new int[input.length-1];
		
		for(int i=1;i<input.length;i++) {
			smallInput[i-1]=input[i];
		}
		
		return input[0]+sumArray(smallInput);
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3};
		System.out.println(checkSortedBetter(arr));
		System.out.println(sumArray(arr));
		
		

	}

}
