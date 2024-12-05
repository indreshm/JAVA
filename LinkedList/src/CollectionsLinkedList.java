import java.util.LinkedList;
public class CollectionsLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> list = new LinkedList<>();
		//implemented as doubly Linked List
		list.add(10);
		list.add(20);
		list.addFirst(0);
		list.addLast(30);
		list.addFirst(10);
		System.out.println(list.size());
		list.set(3,100);
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}

	}

}
