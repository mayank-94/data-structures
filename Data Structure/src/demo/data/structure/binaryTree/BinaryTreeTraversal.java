/**
 * 
 */
package demo.data.structure.binaryTree;

import java.util.Stack;
import java.util.ArrayList;

/**
 * @author Mayank
 *
 */
class BinaryTree{
	
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
		root.left.right = new Node(5);
		root.right.left = new Node(6);
	}
	
	ArrayList<Integer> inOrder(Node node, ArrayList<Integer> list) {		
		if(node == null)
			return list;
		
		inOrder(node.left, list);
		list.add(node.data);
		inOrder(node.right, list);
		
		return list;
	}

	public void inOrder() {
		System.out.print("InOrder - ");
		ArrayList<Integer> list = new ArrayList<>();
		inOrder(root, list);
		System.out.println(list);
	}
	
	public void inOrderWithoutRecursion() {
		Node current = root;
		Stack<Node> stack = new Stack<>();
		System.out.print("InOrder Without Recursion - ");
		while(current != null || stack.size() > 0) {
			while(current != null) {
				stack.push(current);
				current = current.left;
			}
			
			current = stack.pop();
			System.out.print(current.data+" ");
			current = current.right;
		}
	}
	
	void preOrder(Node node) {
		if(node == null)
			return;
		
		System.out.print(node.data+" ");
		preOrder(node.left);
		preOrder(node.right);
	}
	
	public void preOrder() {
		System.out.print("PreOrder - ");
		preOrder(root);
	}
	
	public void preOrderWithoutRecursion() {
		Node current = root;
		Stack<Node> stack = new Stack<>();
		System.out.print("PreOrder Without Recursion - ");
		while(current!=null || stack.size()>0) {
			while(current != null) {
				System.out.print(current.data+" ");
				stack.push(current);
				current = current.left;
			}
			current = stack.pop();
			current = current.right;
		}
	}
	
	void postOrder(Node node) {
		if(node == null)
			return;
		
		postOrder(node.left);
		postOrder(node.right);
		System.out.print(node.data+" ");
	}
	
	public void postOrder() {
		System.out.print("PostOrder - ");
		postOrder(root);
	}
}

public class BinaryTreeTraversal {
	
	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		tree.createTree();
//		tree.inOrder();
//		System.out.println();
//		tree.preOrder();
//		System.out.println();
//		tree.postOrder();
//		System.out.println();
//		tree.inOrderWithoutRecursion();
//		System.out.println();
		tree.preOrderWithoutRecursion();
	}

}
