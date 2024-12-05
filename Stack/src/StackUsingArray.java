
public class StackUsingArray {
	private int data[];
	private int top;
	
	public StackUsingArray() {
		this.data = new int[10];
		top = -1;
	}
	
	public StackUsingArray(int capacity) {
		data = new int[capacity];
		top= -1;
	}
	
	public boolean isEmpty() {
		return (top==-1);
		// or
//		if(top==-1) {
//			return true;
//		}
//		else {
//			return false;
//		}
	}
	
	public int size() {
		return top++;
	}
	
	public int top() throws StackEmptyExeption {
		
		if(size()==0){
			//stack empty exception
			StackEmptyExeption e= new StackEmptyExeption();
			throw e;
		}
		return data[top];
	}
	
	public void push(int elem) throws StackFullException{
		
		if(size()==data.length){
			// stack full
			StackFullException e= new StackFullException();
			throw e;
		}
		top++;
		data[top]= elem;
		
	}
	
	public int pop() throws StackEmptyExeption {
		
		if(size()==0) {
			//stack empty exception
			StackEmptyExeption e = new StackEmptyExeption();
			throw e;
		}
		int temp= data[top];
		top--;
		return temp;
	}
}
