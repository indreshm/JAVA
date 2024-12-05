
public class returnKeyPad {
    public static String[] returnKeyP(int n) {
    	if(n==0) {
    		String ans[] = {""};
    		return ans;
    	}
    	
    	int lastDigit = n%10;
    	int smallNumber = n/10;       //remaining number
    	
    	String smallAns[] = returnKeyP(smallNumber);
    	
    	char option[] = numberOptions(lastDigit);
    	
    	String ans[] = new String[option.length*smallAns.length];
    	int k=0;
    	for(int i = 0;i<smallAns.length;i++) {
    		for(int j =0; j<option.length;j++) {
    			ans[k] = smallAns[i]+option[j];
    			k++;
    		}
    	}
    	return ans;
    }
    public static char[] numberOptions(int n) {
//    	switch n {
//    	case 2:
//    		char options2[] = {'a','b','c'};
//    		return options2;
//    	case 3:
//    		char options3[]= {'d','e','f'};
//    		return option3;
//    	case 4:
//    		char options4[]= {'g','h','i'};
//    		return option4;
//    	}
    	if(n==2) {
    		char options2[] = {'a','b','c'};
    		return options2;
    	}
    	if(n==3) {
    		char options3[]= {'d','e','f'};
    		return options3;
    	}
    	char options[] = {' '};
    	return options;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ans[]=returnKeyP(23);
		for(int i =0;i<ans.length;i++) {
			System.out.println(ans[i]);
		}
	
	}

}
