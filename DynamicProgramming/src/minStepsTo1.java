
public class minStepsTo1 {
	
	
    public static int countSteps(int n) {
    	//base case
    	if(n==1) {
    		return 0;
    	}
    	int op1=countSteps(n-1);
    	int minSteps=op1;
    	
    	if(n%3==0) {
    		int op2=countSteps(n/3);
    		if(op2<minSteps) {
    			minSteps=op2;
    		}
    	}
    	
    	if(n%2==0) {
    		int op3=countSteps(n/2);
    		if(op3<minSteps) {
    			minSteps=op3;
    		}
    	}
    	return 1+minSteps;
    	
    }
    
    
    
    
    //countSteps memoization
    
    public static int countStepsM(int n) {
    	int storage[] = new int[n+1];
    	return countStepsM(n,storage);
    }
    
    public static int countStepsM(int n, int storage[]) {
    	
    	//base case
    	if(n==1) {
    		storage[n]=0;
    		return storage[n];
    	}
    	
    	if(storage[n]!=0) {
    		return storage[n];
    	}
    	
    	int op1 = countStepsM(n-1,storage);
    	int minSteps = op1;
    	
    	if(n%3==0) {
    		int op2= countStepsM(n/3,storage);
    		if(op2<minSteps) {
    			minSteps=op2;
    		}
    	}
    	if(n%2==0) {
    		int op3= countStepsM(n/2,storage);
    		if(op3<minSteps) {
    			minSteps=op3;
    		}
    	}
    	
    	storage[n]=1+minSteps;
    	return storage[n];
    }
    
    //using DP
    public static int countStepsDP(int n) {
    	int storage[]=new int[n+1];
    	storage[1]=0;
    	
    	for(int i=2;i<n+1;i++) {
    		int op1 = countStepsDP(n-1);
    		int minSteps = op1;
    		if(i%3==0) {
    			int op2=countStepsDP(n/3);
    			if(op2<minSteps) {
    				minSteps=op2;
    			}
    		}
    		if(i%2==0) {
    			int op3= countStepsDP(n/2);
    			if(op3<minSteps) {
    				minSteps=op3;
    			}
    		}
    		storage[i]=1+minSteps;
    	}
    	return storage[n];
    }
    
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(countSteps(10));
		System.out.println(countStepsM(10));
		System.out.println(countStepsDP(10));

	}

}
