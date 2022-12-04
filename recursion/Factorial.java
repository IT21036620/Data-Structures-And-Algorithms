package recursion;

public class Factorial {
	private int num;
	private int factorial;
	
	public Factorial(int n) {
		this.num=n;
		this.factorial=0;
	}
	
	private int calculate(int n) {
		
		if(n==0) {
			return 1;
		}
		if(n==1) {
			System.out.print(n+" =");
		}
		else {
		System.out.print(n+" * ");
		}
		factorial = n*calculate(n-1);
		return factorial;
		
	}
	public void calculate() {
		int value =calculate(num); 
		System.out.println(value);
	}
	

}
