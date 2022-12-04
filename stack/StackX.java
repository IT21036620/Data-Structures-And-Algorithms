package stack;

public class StackX {

	private int[] stackArray;
	private int top;
	private int maxSize;
	
	public StackX(int maxSize) {
		super();
		this.stackArray = new int[maxSize];
		this.top = -1;
		this.maxSize = maxSize;
	}
	
	public void push(int value) {
		if(top==maxSize-1)
			System.out.println("stack is full");
		else
			stackArray[++top]= value;
	}
	
	public int pop() {
		return stackArray[top--];
	}
	
	public int peek() {
		return stackArray[top];
	}
	public int peek1() {
		int y = pop();
		push (y);
		return y;
	}
	
	public void show() {
		for(int x : stackArray) {
			System.out.print(x+" ");
		}
	}
	
	public boolean isEmpty() {
		return(top== -1);
	}
	
	public boolean isFull() {
		return(top==maxSize-1);
	}
	

}


