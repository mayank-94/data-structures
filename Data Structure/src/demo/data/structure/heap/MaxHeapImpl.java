/**
 * 
 */
package demo.data.structure.heap;

/**
 * @author Mayank
 *
 */
class MaxHeap{
	private int[] Heap;
	private int size;
	private int maxSize;
	
	public MaxHeap(int maxSize) {
		this.maxSize = maxSize;
		this.size = 0;
		Heap = new int[this.maxSize];
	}
	
	public void insert(int element) {
		if(Heap[size] == 0) {
			Heap[size] = element;
			return;
		}
		
		size++;
		Heap[size] = element;
		int current = size;
		int parent = (current-1)/2;
		while(Heap[current] > Heap[parent]) {
			swap(current, parent);
			current = parent;
			parent = (current-1)/2;
		}
	}

	private void swap(int i, int j) {
		int temp = Heap[i];
		Heap[i] = Heap[j];
		Heap[j] = temp;
	}
	
	public int extractMax() {
		int popped = Heap[0];
		Heap[0] = Heap[size--];
		maxHeapify(0);
		return popped;
	}
	
	private boolean ifLeaf(int pos) {
		if(pos >= size/2 && pos <= size)
			return true;
		
		return false;
	}
	
	private void maxHeapify(int pos) {
		
		if(ifLeaf(pos)) return;
		
		if(Heap[pos] < Heap[2*pos+1] || 
				Heap[pos] < Heap[2*pos+2]) {
			
			if(Heap[2*pos+1] > Heap[2*pos+2]) {
				swap(pos, 2*pos+1);
				maxHeapify(2*pos+1);
			}else {
				swap(pos, 2*pos+2);
				maxHeapify(2*pos+2);
			}
		}
	}

	public void printHeap() {		
		for(int i=0; i<size; i++)
			System.out.print(Heap[i]+" ");
		
		System.out.println();
	}
}

public class MaxHeapImpl {

	public static void main(String[] args) {
		
		MaxHeap heap = new MaxHeap(8);
		heap.insert(70);
		heap.insert(50);
		heap.insert(40);
		heap.insert(45);
		heap.insert(60);
		heap.insert(75);
		heap.insert(25);
		heap.insert(98);
		
		heap.printHeap();
		int ele = heap.extractMax();
		System.out.println(ele);
		heap.printHeap();
	}
}
