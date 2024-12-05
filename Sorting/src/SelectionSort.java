
public class SelectionSort {
	
	public static void Selection(int input[]) {
		for(int i =0; i<input.length; i++) {
			
			int min = input[i];
			int minIndex = i;
			
			for(int j = i+1 ; j<input.length;j++){
				if(min>input[j]) {
					min = input[j];
					minIndex = j;
				}
			}
			//swap
			int temp = input[i];
			input[i] = input[minIndex];
			input[minIndex]=temp;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,6,7,8,9,10,2,4,5};
		Selection(arr);
		for(int i =0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		

	}

}
