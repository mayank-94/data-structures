/**
 * 
 */
package demo.data.structure.binaryTree;

/**
 * @author Mayank
 *
 */
class SymmetricTree{
	
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
	
	boolean isSymmetric(Node left, Node right) {
		
		if(left == null && right == null)
			return true;
		
		if(left!=null && right!=null && left.data == right.data)
			return (isSymmetric(left.left, right.right) && isSymmetric(left.right, right.left));
		
		return false;
	}
	
	boolean isSymmetric() {
		return isSymmetric(root, root);
	}
}

public class SymmetricTreeDemo {
	public static void main(String[] args) {
		
		SymmetricTree symmetric = new SymmetricTree();
		symmetric.createTree();
		boolean isSymmetric = symmetric.isSymmetric();
		System.out.println(isSymmetric);
	}
}
