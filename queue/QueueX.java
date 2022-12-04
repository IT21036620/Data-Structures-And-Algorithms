package queue;

public class QueueX {
	private int maxSize;
	private int[] queArray;
	private int front;
	private int rear;
	private int nItems;
	
	public QueueX(int size) {
		queArray= new int[size];
		this.maxSize=size;
		this.front=0;
		this.rear=-1;
		this.nItems=0;
		
		
	}
	
	public void insert(int value) {
		if(nItems==maxSize)
			System.out.println("Queue is full");
		else {
			if(rear==maxSize-1)
				rear = -1;
			queArray[++rear]=value;
			nItems++;}
		
	}
	
	public int remove() {
		if(nItems==0) {
			System.out.println("Queue is Empty");
			return -99;
		}else {
			nItems--;
			int temp = queArray[front++];
			if(front==maxSize)
				front=0;
			return temp;
		}
	}
	
	public int peekFront() {
		if(nItems==0) {
			System.out.println("Queue is Empty");
			return -99;
		}else {
			return queArray[front];
		}
	}
	public boolean isFull() {
		return nItems==maxSize;
	}
	
	public boolean isEmpty() {
		return (nItems==0);
	}
		
}
