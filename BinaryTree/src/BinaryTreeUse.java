import java.util.Scanner;
public class BinaryTreeUse {
    
	//take input
//	public static BinaryTreeNode<Integer> takeInput(){
//		Scanner s=new Scanner(System.in);
//		System.out.println("Enter root data");
//		int data=s.nextInt();
//		BinaryTreeNode<Integer> root=new BinaryTreeNode<Integer>(data);
//		root.left=takeInput();
//		root.right=takeInput();
//		return root;
//	}
	
//	public static void printTree(BinaryTreeNode<Integer> root) {
//		
//	}
	
	
	// Binary Search tree
	
	public static boolean isBST(BinaryTreeNode<Integer> root) {
		if(root==null) {
			return true;
		}
		
		int leftMax=maximum(root.left);
		int rightMin=minimum(root.right);
		
		if(root.data<=leftMax) {
			return false;
		}
		if(root.data>rightMin) {
			return false;
		}
		
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	BinaryTreeNode<Integer> root= new BinaryTreeNode<>(1);
		
	//left child
 //       BinaryTreeNode<Integer> node1= new BinaryTreeNode<>(2);
//		root.left=node1;
//		
//		//right child
//		BinaryTreeNode<Integer> node2= new BinaryTreeNode<>(3);
//		root.right=node2;
//		
//		System.out.println(root);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
//		
		
		
		

	}

}
