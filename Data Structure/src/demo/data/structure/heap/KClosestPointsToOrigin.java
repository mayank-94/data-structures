/**
 * 
 */
package demo.data.structure.heap;

import java.util.PriorityQueue;
import java.util.Comparator;
/**
 * @author Mayank
 *
 */

class PointPair{
	private int x;
	private int y;
	
	public PointPair(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "{"+ x + ", " + y + "}";
	}
}

class DistancePair{
	private int dist;
	private PointPair pair;
	
	public DistancePair(int dist, PointPair pair) {
		super();
		this.dist = dist;
		this.pair = pair;
	}

	public int getDist() {
		return dist;
	}

	public void setDist(int dist) {
		this.dist = dist;
	}

	public PointPair getPoint() {
		return pair;
	}

	public void setPoint(PointPair pair) {
		this.pair = pair;
	}
	
}

public class KClosestPointsToOrigin {

	public static void main(String[] args) {
		
		int arr[][] = {{1, 3}, {-2, 2}, {0, 1}, {5, 8}};
		int k = 2;
		PriorityQueue<DistancePair> heap = new PriorityQueue<>(new Comparator<DistancePair>() {
			@Override
			public int compare(DistancePair p1, DistancePair p2) {
				return p2.getDist() - p1.getDist();
			}
		});
		
		for(int i=0; i<arr.length; i++) {
			int distance = arr[i][0]*arr[i][0] + arr[i][1]*arr[i][1];
			PointPair pair = new PointPair(arr[i][0], arr[i][1]);
			DistancePair disPair = new DistancePair(distance, pair);
			
			heap.add(disPair);
			if(heap.size() > k)
				heap.poll();
		}
		
		while(heap.size() > 0)
			System.out.println(heap.poll().getPoint());
	}
}
