/**
 * 
 */
package demo.data.structure.recursion;

/**
 * @author Mayank
 *
 */
class BinaryTree{
	Node root;
	
	class Node{
		int data;
		Node left;
		Node right;
		
		Node(int data){
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}
	
	void createTree() {
		root = new Node(5);
		root.left = new Node(7);
		root.right = new Node(6);
		root.left.left = new Node(5);
		root.left.right = new Node(3);
		root.left.right.left = new Node(2);
	}
	
	int height(Node root) {
		if(root == null)
			return 0;
		
		int leftHeight = height(root.left);
		int rightHeight = height(root.right);
		
		return Math.max(leftHeight, rightHeight) + 1;
	}
}

public class HeightOfATree {

	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		tree.createTree();
		int height = tree.height(tree.root);
		System.out.println("Height of a Binary tree is "+height);
	}
}
