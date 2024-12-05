import java.util.Stack;
public class stackCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> s= new Stack<>();
		boolean a=s.isEmpty();
		System.out.println(a);
		
		s.push(10);
		s.push(11);
		s.push(12);
		int size=s.size();
		System.out.println(size);
		s.pop();
		int top=s.peek();
		System.out.println(top);
	}

}
