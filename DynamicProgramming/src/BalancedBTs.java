
public class BalancedBTs {
	
	public static int countBalancedBTs(int h) {
		//base case
		if(h==0||h==1) {
			return 1;
		}
		int x =countBalancedBTs(h-1);
		int y =countBalancedBTs(h-2);
		return x*x + 2*x*y;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(countBalancedBTs(3));
	}

}
