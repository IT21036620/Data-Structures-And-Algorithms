package linkedList;

public class LinkedList {
	private Link first;
	
	public LinkedList() {
		this.first=null;
	}
	
	public void displayList() {
		
		Link cur = first;
		
		while(cur!=null) {
			cur.displayLink();
			cur=cur.next;
		}
	}
	
	public Link find(int key) {
		Link cur = first;
		while(cur!=null) {
			if(cur.iData==key)
				return cur;
			cur=cur.next;
		}
		return null;
	}
	
	public void  insertFirst(int key) {
		Link newFirst = new Link(key);
		
		newFirst.next = first;
		first = newFirst;
		
	}
	 public boolean insertAfter(int key,int iData) {
		 
		 Link newLink = new Link(iData);
		 Link cur = first;
		 while(cur!=null) {
			 if(cur.iData==key) {
				 newLink.next=cur.next;
				 cur.next=newLink;
				 return true;
			 }else {
				 cur=cur.next;
			 }
			 
		 }
		 return false;
	 }
	 
	 public void insert(int data) {
		 Link cur =first;
		 Link newLink = new Link(data);
		 
		 if(cur==null) {
			 first=newLink;
		 }else {
			 while(cur.next!=null) {
			 cur= cur.next;
		 }
		 cur.next=newLink;
		 }
			 
	 }
	 public void deleteLast() {
		 Link cur = first;
		 Link prev = first;
		 if(first==null) {
			 System.out.println("Queue empty");
		 }else {
		 while(cur.next!=null) {
			 prev = cur;
			 cur=cur.next;
		 }
		 prev.next=null;
		 }
	 }
	 
	 public boolean delete(int key) {
		 Link cur = first;
		 Link pre = first;
		 if(cur.iData==key) {
			 first=first.next;
			 return true;
		 }else {
			 
			 while(cur!=null) {
			 if(cur.iData==key) {
				 pre.next=cur.next;
				 return true;
			 }else {
				 pre= cur;
				 cur=cur.next;
			 }
		 }
		 return false;
		 }
			 
	 }
	 
	 public void reverse() {
		 Link pointer = first;
		 if(pointer==null) {
			 System.out.println("No Items In The List");
			 return;
		 }
		 Link current = null;
		 Link previous =null;
		 
		 while(pointer!=null) {
			 current =pointer;
			 pointer=pointer.next;
			 current.next=previous;
			 previous= current;
			 first=current;
		 }
		 
		 
	 }

}
