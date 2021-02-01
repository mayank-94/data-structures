/**
 * 
 */
package demo.data.structure.binaryTree;
/**
 * @author Mayank
 *
 */
class SumNode{
	
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
		root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.left = new Node(6);
	}
	
	public int sumOfNodes(Node node) {
		if(node == null)
			return 0;
		
		return sumOfNodes(node.left) + sumOfNodes(node.right) + node.data;
	}
}

public class SumOfNodes {

	public static void main(String[] args) {
		
		SumNode tree = new SumNode();
		tree.createTree();
		int sum = tree.sumOfNodes(tree.root);
		System.out.println("Sum of Nodes is "+sum);
	}
}
