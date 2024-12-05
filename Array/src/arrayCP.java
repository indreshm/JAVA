import java.util.Scanner;
public class arrayCP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int size= s.nextInt();
		int input[] = new int[size];
		for(int i=0;i<size;i++) {
			input[i] = s.nextInt();
		}
		for(int i=0;i<size;i++) {
			System.out.print(input[i]+" ");
		}
		System.out.println();

	}

}
