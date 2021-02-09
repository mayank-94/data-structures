/**
 * 
 */
package demo.data.structure.binaryTree;

import java.util.Stack;

/**
 * @author Mayank
 *
 */
class SpiralTraversal{
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
		root = new Node(10);
		root.left = new Node(20);
		root.right = new Node(30);
		root.left.left = new Node(40); 
        root.left.right = new Node(60); 
	}
	
	void spiral(Node node) {
		if(node == null)
			return;
		Stack<Node> s1 = new Stack<>();
		Stack<Node> s2 = new Stack<>();
		s1.push(node);
		
		while(!s1.isEmpty() || !s2.isEmpty()) {
			while(!s1.isEmpty()) {
				Node temp = s1.pop();
				System.out.print(temp.data+" ");
				
				if(temp.right != null)
					s2.push(temp.right);
				
				if(temp.left != null)
					s2.push(temp.left);
			}
			
			while(!s2.isEmpty()) {
				Node temp = s2.pop();
				System.out.print(temp.data+" ");
				
				if(temp.left != null)
					s1.push(temp.left);
				
				if(temp.right != null)
					s1.push(temp.right);
			}
		}
		
	}
}

public class SpiralTraversalDemo {

	public static void main(String[] args) {
		
		SpiralTraversal tree = new SpiralTraversal();
		tree.createTree();
		tree.spiral(tree.root);
	}
}
