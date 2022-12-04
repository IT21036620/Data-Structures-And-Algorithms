package linkedList;

public class LinkListMain {

	public static void main(String[] args) {
		LinkedList newList = new LinkedList();
		
		newList.insertFirst(10);
		newList.insertAfter(10,20);
		newList.insertAfter(20,30);
//		newList.insertAfter(30,40);
//		newList.insertFirst(5);
		newList.deleteLast();
		
//		newList.delete(20);
		
//		newList.insertLast(50);
		
		newList.displayList();
//		newList.reverse();
//		newList.displayList();

	}

}
