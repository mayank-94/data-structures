/**
 * 
 */
package demo.data.structure.binaryTree;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Mayank
 *
 */
class RightView{
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
        root.right.right = new Node(7); 
		root.right.right.right = new Node(8);
	}
	
	static int maxLevel = 0;
	public void rightView(Node node, List<Integer> list, int level){
        
        if(node == null)
            return;
        
        if(maxLevel < level){
            list.add(node.data);
            maxLevel = level;
        }
        
        rightView(node.right, list, level + 1);
        rightView(node.left, list, level + 1);
        
    }
	public void rightViewList(Node node) {
		List<Integer> list = new ArrayList<>();
		rightView(node, list, 1);
		System.out.println(list);
	}
}

public class RightViewDemo {

	public static void main(String[] args) {
		
		RightView view = new RightView();
		view.createTree();
		view.rightViewList(view.root);
	}
}
