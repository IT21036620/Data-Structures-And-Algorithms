package queue;

public class QueueMain {

	public static void main(String[] args) {
		QueueX queue =new QueueX(5);
		
		queue.insert(1);
		queue.insert(2);
		queue.insert(3);
		queue.insert(4);
		queue.insert(5);
		
//		System.out.println(queue.peekFront()) ;
//		
//		while(!queue.isEmpty())
//			System.out.print(queue.remove()+" ");
//		
//		System.out.println(queue.isEmpty());
//		System.out.println(queue.isFull());
	

	}

}
