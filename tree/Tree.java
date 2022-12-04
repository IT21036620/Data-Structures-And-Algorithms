package tree;

public class Tree {
	private Node root;
	
	public Tree() {
		this.root=null;
	}
	
	public Node find(int key) {
		Node cur= root;
		while (cur.iData!=key) {
			if(key<cur.iData)
				cur=cur.leftChild;
			else
				cur=cur.rightChild;
			if(cur==null)
				return null;
		}
		return cur;
	}
	
	public void insert(int iData,double dData) {
		Node newNode = new Node(iData,dData);
		
		if(root==null) {
			root=newNode;
		}
		else {
			Node cur =root;
			Node previous=root;
			
			while(true) {
				previous=cur;
				if(newNode.iData<cur.iData) {
					cur=cur.leftChild;
					if(cur==null) {
						previous.leftChild=newNode;
						return;
					}
				}
				else {
					cur=cur.rightChild;
					if(cur==null) {
						previous.rightChild=newNode;
						return;
				}
			}
			}
		}
		
	}
	
	private void inOrder(Node localRoot) {
		if(localRoot!=null) {
			inOrder(localRoot.leftChild);
			localRoot.displayNodeId();
			inOrder(localRoot.rightChild);
		}
	}
	public void inOrder() {
		inOrder(root);
	}
	
	private void preOrder(Node localRoot) {
		if(localRoot!=null) {
			
			localRoot.displayNodeId();
			preOrder(localRoot.leftChild);
			preOrder(localRoot.rightChild);
		}
	}
	public void preOrder() {
		preOrder(root);
	}
	
	private void postOrder(Node localRoot) {
		if(localRoot!=null) {
			postOrder(localRoot.leftChild);
			postOrder(localRoot.rightChild);
			localRoot.displayNodeId();
			
		}
	}
	public void postOrder() {
		postOrder(root);
	}

}
