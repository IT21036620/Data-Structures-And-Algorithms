package tree;

public class Node {
	public int iData;
	public double dData;
	public Node leftChild;
	public Node rightChild;
	
	public Node(int iData, double dData) {
		super();
		this.iData = iData;
		this.dData = dData;
		this.leftChild = null;
		this.rightChild = null;
	}
	
	public void displayNodeId() {
		System.out.print(iData+" ");
	}
	
	public void displayNode() {
		System.out.println(iData+","+dData);
	}
	

}
