/**
 * 
 */
package demo.data.structure.heap;

import java.util.PriorityQueue;

/**
 * @author Mayank
 *
 */
class Node implements Comparable<Node>{
	
	int array, index, value;
	
	public Node(int array, int index, int value) {
		this.array = array;
		this.index = index;
		this.value = value;
	}
	
	@Override
	public int compareTo(Node n1) {
		return this.value - n1.value;
	}
	
}

public class MergeK_SortedArray {

	public static void main(String[] args) {
		
		int arr[][] = {{1, 4, 7}, {2, 5, 8}, {3, 6, 9}};
		PriorityQueue<Node> heap = new PriorityQueue<>();
		int size = 0;
		
		for(int i=0; i<arr.length; i++) {
			size += arr[i].length;
			heap.add(new Node(i, 0, arr[i][0]));
		}
		
		int []result = new int[size];
		for(int i=0; !heap.isEmpty(); i++) {
			Node node = heap.poll();
			result[i] = node.value;
			int newIndex = node.index + 1;
			if(newIndex < arr[node.array].length)
				heap.add(new Node(node.array, newIndex, arr[node.array][newIndex]));
		}
		
		for(int x : result)
			System.out.print(x+" ");
	}
}
