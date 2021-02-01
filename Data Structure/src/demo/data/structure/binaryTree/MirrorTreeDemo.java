/**
 * 
 */
package demo.data.structure.binaryTree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Mayank
 *
 */

class MirrorTree{
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
        root.right.left = new Node(6); 
        root.right.right = new Node(7); 
	}
	
	void mirror(Node node) {
		if(node == null)
			return;
		
		Node temp = node.left;
		node.left = node.right;
		node.right = temp;
		
		mirror(node.left);
		mirror(node.right);
	}
	
	void traversal(Node node) {
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
		System.out.println();
	}
}

public class MirrorTreeDemo {

	public static void main(String[] args) {
		
		MirrorTree tree = new MirrorTree();
		tree.createTree();
		tree.traversal(tree.root);
		tree.mirror(tree.root);
		tree.traversal(tree.root);
	}
}
