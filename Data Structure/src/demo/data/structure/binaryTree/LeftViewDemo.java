/**
 * 
 */
package demo.data.structure.binaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Mayank
 *
 */
class LeftView{
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
		root = new Node(4);
		root.left = new Node(5);
		root.right = new Node(2);
		root.right.left = new Node(3); 
        root.right.right = new Node(1); 
        root.right.left.left = new Node(6); 
        root.right.left.right = new Node(7); 
	}
	
	ArrayList<Integer> getLeaves(Node node){
		ArrayList<Integer> leaves = new ArrayList<>();
		Queue<Node> queue = new LinkedList<>();
		queue.add(node);
		while(queue.size() > 0) {
			int n = queue.size();
			
			for(int i=1; i<=n; i++) {
				Node temp = queue.poll();
				if(i == 1)
					leaves.add(temp.data);
				
				if(temp.left != null)
					queue.add(temp.left);
				
				if(temp.right != null)
					queue.add(temp.right);
			}
		}
		
		return leaves;
	}
}

public class LeftViewDemo {

	public static void main(String[] args) {
		
		LeftView view = new LeftView();
		view.createTree();
		ArrayList<Integer> leftView = view.getLeaves(view.root);
		System.out.println(leftView);
	}
}
