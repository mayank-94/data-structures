/**
 * 
 */
package demo.data.structure.binaryTree;

import java.util.Stack;

/**
 * @author Mayank
 *
 */
class Leaves{
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
	
	int countLeaves(Node node) 
    {
        int counter = 0;
        Stack<Node> stack = new Stack<>();
        while(node != null || stack.size() > 0){
            while(node != null){
               stack.push(node);
               node = node.left;
            }
            node = stack.pop();
            if(node.left == null && node.right == null)
               counter++;
                
            node = node.right;    
                 
        }
        return counter;
    }
	
	int countLeavesRecursive(Node node) {
		if(node == null)
			return 0;
		
		if(node.left == null && node.right == null)
			return 1;
		
		return countLeavesRecursive(node.left) + countLeavesRecursive(node.right);
	}
}

public class CountLeaves {

	public static void main(String[] args) {
		
		Leaves leaves = new Leaves();
		leaves.createTree();
		int count = leaves.countLeaves(leaves.root);
		System.out.println(count);
		System.out.println(leaves.countLeavesRecursive(leaves.root));
	}

}
