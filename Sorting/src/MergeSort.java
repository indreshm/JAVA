
public class MergeSort {
	
//	public static void merge(int s1[], int s2[], int d[]) {
//		
//		int i =0;
//		int j =0;
//		int k =0;
//		
//		while(i<s1.length&&j<s2.length) {
//			if(s1[i]<=s2[j]) {
//				d[k] =s1[i];
//				i++;
//				k++;
//			}else {
//				d[k]=s2[j];
//				j++;
//				k++;
//			}
//		}
//		
//		if(i<s1.length) {
//			while(i<s1.length) {
//			    d[k] = s1[i];
//			    i++;
//			    k++;
//			}
//		}
//		if(j<s2.length) {
//			while(j<s2.length) {
//			    d[k]=s2[j];
//			    k++;
//			    j++;
//			}
//		}
//	}
    
	public static void mergeSort(int a[]) {
		if(a.length<=1) {
			return ;
		}
		int b[] = new int[a.length/2];
		int c[] = new int[a.length-b.length];
		
		for(int i = 0; i<a.length/2;i++) {
			b[i] = a[i];
		}
		for(int i = a.length/2;i<a.length;i++) {
			c[i-a.length/2] = a[i];
		}
		mergeSort(b);
		mergeSort(c);
		
		merge(b,c,a);
		
	}
	
	public static void merge(int s1[], int s2[], int d[]) {
		
		int i =0;
		int j =0;
		int k =0;
		
		while(i<s1.length&&j<s2.length) {
			if(s1[i]<=s2[j]) {
				d[k] =s1[i];
				i++;
				k++;
			}else {
				d[k]=s2[j];
				j++;
				k++;
			}
		}
		
		if(i<s1.length) {
//			while(i<s1.length) {
			    d[k] = s1[i];
			    i++;
			    k++;
//			}
		}
		if(j<s2.length) {
//			while(j<s2.length) {
			    d[k]=s2[j];
			    k++;
			    j++;
//			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int arr[] = {1,2,5,7,6,12};
//		mergeSort(arr);
//		for(int i =0;i<arr.length;i++) {
//			System.out.println(arr[i]);
//		}
		
//		for (int n=0; n<1000000;n=n*10) {
//			int[] input=new int[n];
//			for(int i=0;i<input.length;i++) {
//				input[i]=input.length-i;
//			}
//			long startTime = System.currentTimeMillis();
//			mergeSort(input);
//			long endTime = System.currentTimeMillis();
//			System.out.println("time by merge sort for"+n+"is"+(endTime-startTime));
//		}
		
		System.out.println(System.currentTimeMillis()/1000/60/60/24/365);
		System.out.println(1970-2024);
		
		System.out.println(1970-2024);
		System.out.println(1970-2024);
		
		Date d1 = new Date();
		

	}

}
