import java.util.Scanner;
public class Array2D {
	
	public static int largestColSum(int input[][]) {
		int row = input.length;
		int col = input[0].length;
		int ans = 0;
		for(int i = 0; i<col;i++) {
			int sum = 0;
			for(int j = 0; j<row;j++) {
				sum+=input[j][i];
			}
			if(sum>ans) {
				ans = sum;
			}
		}
		return ans;
		
	}
     
	public static int[][] takeInput(){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter no.of rows");
		int rows = s.nextInt();
		System.out.println("Enter no. of columns");
		int cols = s.nextInt();
		
		int arr2d[][]  = new int[rows][cols];
		
		for(int i=0;i<rows;i++) {
			for(int j = 0 ; j<cols;j++) {
				System.out.println("Enter Elements for "+i+" rows and " +j+" columns");
				arr2d[i][j] = s.nextInt();
			}
		}
		return arr2d;
	}
	
	public static void print(int arr2d[][]) {
		
		int rows = arr2d.length;
		int cols = arr2d[0].length;
		
		for(int i =0;i<rows ; i++) {
			for(int j =0;j<cols;j++) {
			    System.out.print(arr2d[i][j]+" ");
		    }
		    System.out.println();
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int arr_2D[][]= new int[4][5];
//		System.out.println(arr_2D[1][2]);
//		arr_2D[2][0]=15;
//		System.out.println(arr_2D[2][0]);
////		System.out.println(arr_2D[4][0]); //ArrayIndexOUTofBoundException
//		
////		int arr2[][]=new int[3][2];
//		int arr2[][]= {{1,2},{4,5,6}};
//		System.out.println(arr2[0][1]);
//		
//		int r= arr_2D.length;
//		int c=arr_2D[0].length;  //to find length of col
//		
//		System.out.println(r+"     "+c);
		
//		Scanner s = new Scanner(System.in);
//		System.out.println("Enter no.of rows");
//		int rows = s.nextInt();
//		System.out.println("Enter no. of columns");
//		int cols = s.nextInt();
		
//		int arr2d[][]  = new int[rows][cols];
		
//		for(int i=0;i<rows;i++) {
//			for(int j = 0 ; j<cols;j++) {
//				System.out.println("Enter Elements for "+i+" rows and " +j+" columns");
//				arr2d[i][j] = s.nextInt();
//			}
//		}
//		
//		for(int i =0;i<rows ; i++) {
//			for(int j =0;j<cols;j++) {
//				System.out.print(arr2d[i][j]+" ");
//			}
//			System.out.println();
//		}
		
		// finding length of rows of 2d array
		
//		int nRows = arr2d.length;
//		System.out.println("Length of rows"+nRows);
//		
//		int nCols = arr2d[0].length;
//		System.out.println("Length of columns"+nCols);
//		int arr2d[][]= new int[3][4];
//		System.out.println(arr2d);
//		
//		int arr1d[] =  new int[4];
//		System.out.println(arr1d);
//		
//		System.out.println(arr2d[0]);
//		System.out.println(arr2d.length);
//		System.out.println(arr2d[0].length);
//		System.out.println(arr2d[2].length);
//		
//		int arr3[][] = {{1,2,3,4},{4,5,6,9},{3,5,0,0}};
//		print(arr3);
//		System.out.println(largestColSum(arr3));
//        
//		int input[][]=takeInput();
//		print(input);
		
		
//	    int arr[][]=new int[4][5];
//	    for(int i=0;i<5;i++)
//	    {
//	        arr[i][0]=2;
//	    }
//	    System.out.print(arr[3][0]);
		
		
		
		
		//Jagged array 
		
		int arr2[][] = new int[4][];
		System.out.println(arr2[0]);
		System.out.println(arr2[2]);
		System.out.println(arr2[3]);
		
//		System.out.println(arr2[3][0]);      //error null point exception
		
		for(int i =0; i<arr2.length;i++) {
			arr2[i] = new int[i+2];
			
		}
		
		for(int i =0; i<arr2.length;i++) {
			for(int j =0; j<arr2[i].length;j++) {
				System.out.print(arr2[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
