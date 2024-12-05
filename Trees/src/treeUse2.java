import java.util .Scanner;
public class treeUse2 {
	
	
	//take input recursive
	public static TreeNode<Integer> takeInput( Scanner s){
		System.out.println("Enter root data");
		int data=s.nextInt();
		TreeNode<Integer> root=new TreeNode<Integer>(data);
		System.out.println("Enter no. of Children for "+data);
		int childCount=s.nextInt();
		for(int i=0;i<childCount;i++) {
			TreeNode<Integer> child=takeInput(s);
			root.children.add(child);
		}
		return root;
	}
	//print tree recursive
	public static void print(TreeNode<Integer> root) {
//		//base case
//		if(root.data==null) {
//			return;
//		}
//		System.out.println(root.data);
		
		String s=root.data+":";
		for(int i=0;i<root.children.size();i++) {
			s+=root.children.get(i).data+",";
		}
		System.out.println(s);
		for(int i=0;i<root.children.size();i++) {
			print(root.children.get(i));
		}
	}
	
	
	//take input levelwise
	//using queue
//	public static TreeNode<Integer> takeInput2(){
//		
//	}
	
	//traversal
	public  static void preOrder(TreeNode<Integer> root) {
		System.out.println(root.data+" ");
		for(int i=0;i<root.children.size();i++) {
			preOrder(root.children.get(i));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		TreeNode<Integer> root=takeInput(s);
		print(root);
		preOrder(root);
	}

}
