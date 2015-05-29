package test;

import java.util.PriorityQueue;
//heap nlogn

public class ClosestPoints {
	class Point implements Comparable<Point>{
		
		int X;
		int Y;
		Double distance;
			
		Point(int X, int Y) {
		this.X = X;
		this.Y = Y;
		distance=(double)this.X*this.X+this.Y*this.Y;
		}

		@Override
		public int compareTo(Point compare) {
			// TODO Auto-generated method stub
			return compare.distance.compareTo(distance);
			
		}}
public static void main(String[] args){
	 Point p[]={new ClosestPoints().new Point(1, 1),new ClosestPoints().new Point(2, 1)
	           ,new ClosestPoints().new Point(4, 1),new ClosestPoints().new Point(4, 2)
	           ,new ClosestPoints().new Point(3, 4),new ClosestPoints().new Point(5, 2)
	           ,new ClosestPoints().new Point(3, 1),new ClosestPoints().new Point(0, 0)
	           ,new ClosestPoints().new Point(0, 1)};
	    

	    
	     PriorityQueue<Point> x = ClosestPoints.findClosest(p, 5);
	     while(!x.isEmpty())
	      {System.out.println(x.peek().X +","+x.peek().Y);
	       x.poll();
	      }
}
	
	
public static PriorityQueue<Point> findClosest (Point Points[], int k){
	PriorityQueue<Point> queue = new PriorityQueue<Point>(k);
	for(int i=0; i< Points.length;i++){
		if(queue.size()<k)
		queue.add((Points[i]));
		else if(Points[i].distance<queue.peek().distance){
			queue.poll();
			queue.add(Points[i]);
		}
		}

	
    return queue;
   
	
	
}
	
	

}
