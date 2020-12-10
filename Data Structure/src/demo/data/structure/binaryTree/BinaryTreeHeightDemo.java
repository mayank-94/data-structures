/**
 * 
 */
package demo.data.structure.binaryTree;

/**
 * @author Mayank
 *
 */
class BinaryTreeHeight{
	
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
		root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(2);
		root.left.left = new Node(3); 
        root.left.right = new Node(4); 
        root.right.left = new Node(4); 
        root.right.right = new Node(3); 
	}
	
	int height(Node node) {
		if(node == null)
			return 0;
		
		else {
			int lHeight = height(node.left);
			int rHeight = height(node.right);
			
			return Math.max(lHeight, rHeight) + 1;
		}
	}
}

public class BinaryTreeHeightDemo {

	public static void main(String[] args) {
		
		BinaryTreeHeight tree = new BinaryTreeHeight();
		tree.createTree();
		int height = tree.height(tree.root);
		System.out.println("Height is "+height);
	}
}
