import java.util.Scanner;
public class LLUSE {
	
	public static void printithNode(Node<Integer> head, int i) {
		Node<Integer> tail=head;
		int count=0;
		while(count<i||tail!=null) {
			if(count==i) {
				System.out.println(tail.data);
			}else {
				tail=tail.next;
			}
			count++;
		}
	}
	
	public static void printLL(Node<Integer> head) {
		Node<Integer> temp = head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
	}
	
	public static Node<Integer> takeInput(){
		
		Node<Integer> head = null;
		Scanner s = new Scanner(System.in);
		int data = s.nextInt();
		while(data!=-1) {
			Node<Integer> newNode = new Node<>(data);
			if(head==null) {
				head = newNode;
			}else {
				Node<Integer> temp = head;
				while(temp!=null) {
					temp = temp.next;
				}
				temp.next = newNode;
			}
			data = s.nextInt();
		}
		return head;
		
	}
	
	public static Node<Integer> takeInput2(){
		Node<Integer> head =null, tail=null;
		Scanner s= new Scanner(System.in);
		int data=s.nextInt();
		
		while(data!=-1) {
			Node<Integer> newNode=new Node<>(data);
			if(head==null) {
				head=newNode;
				tail=newNode;
			}else {
				tail.next=newNode;
				tail=newNode;
			}
			data=s.nextInt();
			
		}
		return head;
	}
	
//	public static Node<Integer> insertAtStart(Node head, int data) {
//		Node<Integer> newNode=new Node<>(data);
//		newNode.next=head;
//		head=newNode;
//		return head;
//	}
	
	
	
//	public static Node<Integer> midpoint(Node<Integer> head){
//		Node<Integer> slow=head, fast=head;
//		while(fast.next!=null&&fast.next.next!=null) {
//			slow=slow.next;
//			fast=fast.next.next;
//		}
//		return slow;
//	}
//	
//	
//	
//	
//	
//	public static Node<Integer> insertAtEnd(Node head, int data){
//		Node<Integer> newNode = new Node<>(data);
//		if(head==null) {
//			return newNode;
//		}
//		Node<Integer> temp= head;
//		while(head.next!=null) {
//			temp=temp.next;
//		}
//		temp.next=newNode;
//		return head;
//	}
//	
//	public static Node<Integer> insert(Node<Integer> head, int data, int pos){
//		Node<Integer> newNode=new Node<>(data);
//		if(pos==0) {
//			newNode.next=head;
////			head=newNode;
////			return head;
//			return newNode;
//		}
//		int count=0;
//		Node<Integer> temp= head;
//		while(count<pos-1) {
//			temp=temp.next;
//			count++;
//		}
//		newNode.next=temp.next;
//		temp.next=newNode;
//		return head;
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node<Integer> node1 = new Node<>(10);
		Node<Integer> node2 = new Node<>(20);
		System.out.println(node1.data);		
		System.out.println(node2);
		node1.next = node2;
		System.out.println(node1.next);
		Node<Integer> node3 = new Node<>(30);
		node2.next = node3;
		
		Node<Integer> head = takeInput();
		printLL(head);
		
//		while(head!=null) {
//			System.out.println(head.data);
//			head = head.next;
//		}
		

//		Node<Integer> head= takeInput2();
//		Node<Integer> midpoint= midpoint(head);
//		System.out.println(midpoint.data);
//		System.out.println(head.data);
//		printLL(head);
//		printithNode(head,4);
////		inserAtStart(head,0);
//		
//		insert(head,33,3);
//		printLL(head);
		
//		Node<Integer> node1=new Node<>(10);
//		System.out.println(node1.data);
//		System.out.println(node1.next);
//		
//		Node<Integer> node2= new Node<>(20);
//		node1.next=node2;
//		System.out.println(node2);
//		System.out.println(node1.next);
//		
//		Node<Integer> node3= new Node<>(30);
//		
//		node2.next=node3;
//		
//		Node<Integer> head= node1;
////		Node<Integer> temp=head;
////		while(temp!=null) {
////			System.out.print(temp.data+"  ");
////			temp=temp.next;
////		}
////		
////		System.out.println(head.data);  //error as head is now null
//		
//		
//		printLL(head);
		
		
	}

}
