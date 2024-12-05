
public class BinarySearch {
    public static int Bsearch(int input[],int si, int ei,int x) {
    	if(si>ei) {
    		return -1;
    	}
    	int midIndex = (si+ei)/2;
    	if(input[midIndex]==x) {
    		return midIndex;
    	}else if(input[midIndex]>x) {
    		return Bsearch(input,si,midIndex-1,x);
    	}else {
    		return Bsearch(input,midIndex+1,ei,x);
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5,7,8,9,12,14};
		System.out.println(Bsearch(arr,0,arr.length-1,12));

	}
}
