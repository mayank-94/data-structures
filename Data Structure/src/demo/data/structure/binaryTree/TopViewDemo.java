/**
 * 
 */
package demo.data.structure.binaryTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.TreeMap;

/**
 * @author Mayank
 *
 */
class TopView{
	Node root;
	
	class Node{
		int data;
		int height;
		Node left, right;
		
		Node(int data){
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}
	
	void createTree() {
		root = new Node(2);
		root.left = new Node(7);
		root.right = new Node(5);
		root.left.right = new Node(6);
		root.left.left = new Node(2);
		root.left.right.left = new Node(5);
		root.left.right.right = new Node(11);
		root.right.right = new Node(9);
	}
	
	void topView(Node node) {
		if(node == null)
			return;
		
		Queue<Node> queue = new LinkedList<>();
		TreeMap<Integer, Integer> treeMap = new TreeMap<>();
		queue.add(node);
		
		while(!queue.isEmpty()) {
			Node n = queue.poll();
			int hd = n.height;
			
			if(!treeMap.containsKey(hd))
				treeMap.put(hd, n.data);
			
			if(n.left != null) {
				n.left.height = hd - 1;
				queue.add(n.left);
			}
			
			if(n.right != null) {
				n.right.height = hd + 1;
				queue.add(n.right);
			}
		}
		
		System.out.println(treeMap.values());
	}
}

public class TopViewDemo {

	public static void main(String[] args) {
		
		TopView tree = new TopView();
		tree.createTree();
		tree.topView(tree.root);
	}
}
