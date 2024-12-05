import java.util.Scanner;
public class LinkedListUse {
	public static Node<Integer> takeInput() {
		Scanner s = new Scanner(System.in);
		int data = s.nextInt();
		Node<Integer> head = null, tail=null;
		while(data!=-1) {
		    Node<Integer> newNode = new Node<>(data);
		    if(head==null) {
			    head= newNode;
			    
			    tail=newNode;
		    }
		    else {
			    Node<Integer> temp = head;
//			    while(temp.next!=null) {          //tiime complexity O(n)
//				    temp=temp.next;
//			    }
//			    temp.next= newNode;
			    tail.next= newNode;
			    tail= tail.next;      //tail=newNode;
		    }
		    data = s.nextInt();
	    }
		print(head);
		return head;
	}
	
	
	
	
	public static Node InsertAtStart(Node<Integer> head,int data) {
		Node<Integer> newNode= new Node<>(data);
		newNode.next= head;
		head= newNode;
		print(head);
		return head;
	}
	
	public static Node InsertAtEnd(Node<Integer> head,int data) {
		Node<Integer> newNode = new Node<>(data);
		Node<Integer> temp = head;
		
		while(temp!=null) {
			temp=temp.next;
		}
		temp.next= newNode;
		
		print(head);
		return head;
	}
	
	public static void insert(Node<Integer> head, int data, int pos) {
		Node<Integer> newNode= new Node<>(data);
		Node<Integer> temp= head;
		int i =0;
		while(i<pos-1) {
			temp=temp.next;
			i++;
		}
		newNode.next= temp.next;
		temp.next=newNode;
	}
	
	//at beginning at pos 0
	
	public static Node<Integer> insert2(Node<Integer> head, int data, int pos) {
		
		Node<Integer> newNode = new Node<>(data);
		//pos = 0
		if(pos==0) {
			newNode.next=head;
			return newNode;
		}
		
		else {
			Node<Integer> temp= head;
			int i=0;
			while(i<pos-1) {
				temp=temp.next;
				i++;
			}
			newNode.next=temp.next;
			temp.next= newNode;
			return head;
			
		}
	}
	
	public static void print(Node<Integer> head) {
		
		//temp created so that after full iteration head can not change to null
		Node<Integer> temp = head;
		while(temp!=null){
			System.out.print(temp.data +" ");
			temp= temp.next;
		}
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> node1= new Node<>(10);
		System.out.println(node1);
		System.out.println(node1.data);
		
		Node<Integer> node2 = new Node<>(20);
		
		node1.next = node2;
		System.out.println(node1.next + " "+ node2);
		
		Node<Integer> node3 = new Node<>(30);
		
		node2.next = node3;
		
		// print ll
		
		Node<Integer> head = node1;
		
		while(head!= null) {
			System.out.print(head.data+" ");
			head = head.next;
		}
		
		System.out.println();
//		while(head!= null) {
//			System.out.print("head is null");
//			System.out.print(head.data+" ");
//			head = head.next;
//		}
//		print(node1);
		head =node1;
		InsertAtStart(head,5);
//		
//		print(head);
//		
	//	System.out.println(head.data);
//		head=node1;
//		InsertAtEnd(head,5);
		
		takeInput();
		
		print(insert2(node1,80,0));
		
        
		
	}

}
