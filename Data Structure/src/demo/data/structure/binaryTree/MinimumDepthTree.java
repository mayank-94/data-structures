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
class MinDepth{
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
		root.right = new Node(5);
		root.left.left = new Node(3); 
        root.left.right = new Node(4); 
        root.right.left = new Node(9); 
        root.left.left.left = new Node(15);
        root.left.left.right = new Node(15);
        root.left.left.left.left = new Node(19);
        
	}
	
	int minDepth(Node node) {
		if(node == null)
			return 0;
		
		int height = 1;
		Queue<Node> queue = new LinkedList<>();
		queue.add(node);
		
		while(true) {
			int size = queue.size();
			if(size == 0 || queue.isEmpty()) {
				break;
			}
			
			while(size > 0) {
				Node temp = queue.poll();
				
				if(temp.left == null && temp.right == null)
					return height;
				
				if(temp.left != null)
					queue.add(temp.left);
				
				if(temp.right != null)
					queue.add(temp.right);
				
				size--;
			}
			height ++;
		}
		return height;
	}
}

public class MinimumDepthTree {

	public static void main(String[] args) {
		
		MinDepth depth = new MinDepth();
		depth.createTree();
		int minDepth = depth.minDepth(depth.root);
		System.out.println(minDepth);
	}
}
