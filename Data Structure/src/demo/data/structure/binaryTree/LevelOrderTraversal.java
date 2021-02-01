/**
 * 
 */
package demo.data.structure.binaryTree;

import java.util.Queue;
import java.util.LinkedList;

/**
 * @author Mayank
 *
 */

class LevelOrder{
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
        root.right.left = new Node(9); 
        root.right.right = new Node(8); 
		root.left.left.left = new Node(6);
	}
	
	void levelTraversal(Node node) {
		if(node == null)
			return;
		
		int height = getHeight(node);
		for(int i=1; i<=height; i++) {
			printAtLevel(node, i);
			System.out.println();
		}
	}

	void printAtLevel(Node node, int i) {
		if(node == null)
			return;
		
		if(i == 1) {
			System.out.print(node.data+" ");
			return;
		}
		
		printAtLevel(node.left, i - 1);
		printAtLevel(node.right, i - 1);
	}

	int getHeight(Node node) {
		if(node == null)
			return 0;
		
		else {
			int lHeight = getHeight(node.left);
			int rHeight = getHeight(node.right);
			
			return Math.max(lHeight, rHeight) + 1;
		}
	}
	
	void levelTraversal_Iterative(Node node) {
		if(node == null)
			return;
		
		Queue<Node> queue = new LinkedList<>();
		queue.add(node);
		
		while(!queue.isEmpty()) {
			Node n = queue.poll();
			System.out.print(n.data+" ");
			
			if(n.left!=null)
				queue.add(n.left);
			
			if(n.right!=null)
				queue.add(n.right);
		}
	}
}

public class LevelOrderTraversal {
	
	public static void main(String[] args) {
		
		LevelOrder tree = new LevelOrder();
		tree.createTree();
		tree.levelTraversal(tree.root);
		System.out.println("Iterative Approach");
		tree.levelTraversal_Iterative(tree.root);
	}
}
