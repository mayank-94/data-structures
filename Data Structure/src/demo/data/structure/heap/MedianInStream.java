package demo.data.structure.heap;

import java.util.PriorityQueue;
import java.util.Collections;

public class MedianInStream {
	
	static PriorityQueue<Integer> max = new PriorityQueue<>(Collections.reverseOrder());
	static PriorityQueue<Integer> min = new PriorityQueue<>();
	
	public static void main(String[] args) {
		insertHeap(5);
		balanceHeaps();
		System.out.println(getMedian());
		
		insertHeap(15);
		balanceHeaps();
		System.out.println(getMedian());
		
		insertHeap(1);
		balanceHeaps();
		System.out.println(getMedian());
		
		insertHeap(3);
		balanceHeaps();
		System.out.println(getMedian());
	}
	
	public static void insertHeap(int x)
	{
        // add your code here
        if(max.isEmpty() || max.peek() > x)
            max.add(x);
        else
            min.add(x);
	}
	    
     // Function to balance Heaps
    public static void balanceHeaps()
    {
       // add your code here
        if(max.size() > min.size() + 1)
            min.add(max.poll());
        else if(min.size() > max.size() + 1)
            max.add(min.poll());
    }
    
    // function to getMedian
    public static double getMedian()
    {
        // add your code 
        if(max.size() == min.size())
            return ((double) (min.peek()) + (double) (max.peek())) / 2;
        else if(max.size() > min.size())
            return (double) max.peek();
        else
            return (double) min.peek();
    }

}
