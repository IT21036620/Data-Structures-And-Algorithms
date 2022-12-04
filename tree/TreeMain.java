package tree;

public class TreeMain {

	public static void main(String[] args) {
		Tree tree =new Tree();
		
		tree.insert(5, 5);
		tree.insert(10, 10);
		tree.insert(50, 10);
		tree.insert(1, 10);
		tree.insert(8, 10);
		
		tree.inOrder();

	}

}
