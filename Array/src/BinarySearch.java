                         
public class BinarySearch {
	
	
	public static int binarySearch(int arr[],int x) {
		int start=0, end=arr.length-1;
		while(start<=end) {
			int mid=(start+end)/2;
			
			if(arr[mid]==x) {
				return mid;
			}
			
			else if(arr[mid]>x){
				end=mid-1;
			}
			else {
				start=mid+1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input= {1,2,3,4,5,5,6,7,8,9};
		int x=4;
//		int n=input.length;
	    System.out.println(binarySearch(input,x));

	}

}
