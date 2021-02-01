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
class BottomView{
	Node root;
	
	class Node{
		int data;
		int hd;
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
	
	void bottomView(Node node) {
		
		 if(root == null)
	            return ;
	            
        Queue<Node> queue = new LinkedList<>();
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();
        queue.add(root);
        while(!queue.isEmpty()){
            Node n = queue.poll();
            int height = n.hd;
            
            treeMap.put(height, n.data);
            if(n.left != null){
                n.left.hd = height - 1;
                queue.add(n.left);
            }
            
            if(n.right != null){
                n.right.hd = height + 1;
                queue.add(n.right);
            }
        }
        System.out.println(treeMap.values());
	}
}

public class BottomViewDemo {

	public static void main(String[] args) {
		
		BottomView tree = new BottomView();
		tree.createTree();
		tree.bottomView(tree.root);
	}
}
