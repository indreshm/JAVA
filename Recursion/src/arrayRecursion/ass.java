package arrayRecursion;

public class ass {
    
	public static double findGeometricSum(int k) {
		//base case 
		if(k==0) {
			return 1;
		}
		
		double smallAns=findGeometricSum(k-1);
		
		return smallAns+1/(Math.pow(2,k));
	}
	
	public static sumOfdigits(int input) {
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(1234%10);

	}

}
