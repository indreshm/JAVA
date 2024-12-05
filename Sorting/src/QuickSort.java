
public class QuickSort {
	
	public static void qiucksort(int input[], int si, int ei) {
		if(si>=ei) {
			return;
		}
		
		int pivotPos = partition(input, si, ei);
		
		qiucksort(input,si,pivotPos-1);
		qiucksort(input,pivotPos+1,ei);
	}

	private static int partition(int[] input, int si, int ei) {
		// TODO Auto-generated method stub
		int count =0;
		int pivot= input[si];
		for(int i=si+1;i<=ei;i++) {
			if(input[i]<=pivot) {
				count++;
			}
		}
		int pivotPos = si+count;
		int temp = input[pivotPos];
		input[pivotPos]= input[si];
		input[si] = temp;
		
		int i=si, j =ei;
		while(i<pivotPos && j>pivotPos) {
			if(input[i]<=pivot) {
				i++;
			}else if(input[j]>pivot){
				j--;
			}else {
				temp = input[i];
				input[i] = input[j];
				input[j] = temp;
				i++;
				j--;
			}
		}
		return pivotPos;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {3,4,6,7,4,2,1};
		qiucksort(arr,0,arr.length-1);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}

	}

}
