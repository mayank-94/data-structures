/**
 * 
 */
package demo.data.structure.binaryTree;

/**
 * @author Mayank
 *
 */
class BoundaryNodes{
	Node root;
	
	class Node{
		int data;
		Node left;
		Node right;
		
		Node(int data){
			this.data  = data;
			this.left = null;
			this.right = null;
		}
	}
	
	void createTree() {
		root = new Node(2);
		root.left = new Node(7);
		root.right = new Node(15);
		root.left.left = new Node(3);
		root.left.right = new Node(8);
		root.left.right.left = new Node(5);
		root.left.right.right = new Node(10);
		root.right.right = new Node(20);
		root.right.right.right = new Node(25);
	}
	
	void printBoundary(Node node) {
		if(node != null)
			System.out.print(node.data+" ");
		
		printBoundaryLeft(node.left);
		
		printBoundaryLeaf(node.left);
		printBoundaryLeaf(node.right);
		
		printBoundaryRight(node.right);
		
	}

	private void printBoundaryRight(Node node) {
		if(node == null)
			return;
		
		if(node.right != null) {
			System.out.print(node.data+" ");
			printBoundaryRight(node.right);
		}
	}

	private void printBoundaryLeaf(Node node) {
		if(node == null)
			return;
		
		printBoundaryLeaf(node.left);
		
		if(node.left == null && node.right == null)
			System.out.print(node.data+" ");
		
		printBoundaryLeaf(node.right);
	}

	private void printBoundaryLeft(Node node) {
		if(node == null)
			return;
		
		if(node.left != null) {
			System.out.print(node.data+" ");
			printBoundaryLeft(node.left);
		}
	}
}

public class BoundaryNodesDemo {

	public static void main(String[] args) {
		
		BoundaryNodes boundary = new BoundaryNodes();
		boundary.createTree();
		boundary.printBoundary(boundary.root);
	}
}
