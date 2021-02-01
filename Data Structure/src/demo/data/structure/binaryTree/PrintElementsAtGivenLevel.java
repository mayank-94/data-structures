/**
 * 
 */
package demo.data.structure.binaryTree;
/**
 * @author Mayank
 *
 */
class PrintAtLevel{
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
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.left.left = new Node(6);
        root.right.left = new Node(9); 
        root.right.right = new Node(8); 
	}
	
	void printElements(Node node, int level) {
		
		if(node == null)
			return;
		
		if(level == 1) {
			System.out.print(node.data+" ");
			return;
		}
		
		printElements(node.left, level - 1);
		printElements(node.right, level - 1);
	}
}

public class PrintElementsAtGivenLevel {

	public static void main(String[] args) {
		
		PrintAtLevel tree = new PrintAtLevel();
		tree.createTree();
		tree.printElements(tree.root, 2);
	}
}
