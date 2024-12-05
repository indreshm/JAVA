import java.util.Scanner;
public class TreeUse {
	
	public static TreeNode<Integer> takeInput(){
		
		System.out.println("Enter next node data");
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		
		TreeNode<Integer> root = new TreeNode<>(n);
		
		System.out.println("Enter the no of children for node "+ n);
		
		int childcount= s.nextInt();
		
		for(int i=0;i<childcount;i++) {
			TreeNode<Integer> child=takeInput();
			root.children.add(child);
		}
		return root;
	}
	
	//same in case we input data in one line
	public static TreeNode<Integer> takeInput(Scanner s){
		
		System.out.println("Enter next node data");
//		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		
		TreeNode<Integer> root = new TreeNode<>(n);
		
		System.out.println("Enter the no of children for node "+ n);
		
		int childcount= s.nextInt();
		
		for(int i=0;i<childcount;i++) {
			TreeNode<Integer> child=takeInput();
			root.children.add(child);
		}
		return root;
	}
	
	
	// print tree recursive
	
	public static void print(TreeNode<Integer> root) {
		String s= root.data+":";
		
		for(int i=0;i<root.children.size();i++) {
			s= s+root.children.get(i).data+", ";
			
		}
		System.out.println(s);
		
		for(int i=0;i<root.children.size();i++) {
			print(root.children.get(i));
		}
	}
	
	public static int numNodes(TreeNode<Integer> root) {
		if(root== null) {
			return 0;
		}
		int count=1; //root node count
		
		for(int i=0;i<root.children.size();i++) {
			count+=numNodes(root.children.get(i));
		}
		return count;
		
	}
	
	public static int largestNode(TreeNode<Integer> root) {
		if(root==null) {
			return Integer.MIN_VALUE;
		}
		int ans=root.data;
		for(int i=0;i<root.children.size();i++) {
			int childLargest=largestNode(root.children.get(i));
			if(childLargest>ans) {
				ans=childLargest;
			}
		}
		return ans;
	}
	
//	public static TreeNode<Integer> takeInputlevelwise(){
//		Scanner s=new Scanner(System.in);
//		System.out.println("Enter root data");
//		int rootData=s.nextInt();
//		
//		QueueUsingLL<TreeNode<Integer>> pending nodes= new QueueUsingLL<>();
//		
//		
//	}

	public static void main(String[] args) {
		TreeNode<Integer> root = new TreeNode<>(4);
		TreeNode<Integer> node1= new TreeNode<>(2);
		TreeNode<Integer> node2= new TreeNode<>(3);
		TreeNode<Integer> node3= new TreeNode<>(5);
		TreeNode<Integer> node4 = new TreeNode<>(6);
		
		root.children.add(node1);
		root.children.add(node2);
		root.children.add(node3);
		
		node2.children.add(node4);
		
		System.out.println(root);
		
		TreeNode<Integer> root1=takeInput();
		print(root1);
		
//		Scanner s =new Scanner(System.in);
//		TreeNode<Integer> root3=takeInput(s);
//		print(root3);
		
		int noNodes=numNodes(root1);
		System.out.println(noNodes);
		
		System.out.println(largestNode(root1));
		
		

	}

}
