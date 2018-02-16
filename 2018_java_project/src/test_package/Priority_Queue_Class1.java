package test_package;

import java.util.PriorityQueue;

public class Priority_Queue_Class1 {
	public static void main(String[] args) {
		PriorityQueue pq = new PriorityQueue();
		
		pq.add(10); 
		pq.add(20);
		pq.add(30);
		pq.add(40);
		pq.add(50);
		pq.add(50);//Allows Duplicate Value
//		pq.add("A");//Different Data types Can't be stored 
//		pq.add(null);//Queue Can't have null value
		
		System.out.println(pq);
		System.out.println(pq.size());
		//Will give the first Element from the Queue
		System.out.println(pq.peek());
		//Will remove the first Element from the Queue
		System.out.println(pq.poll());
		System.out.println(pq);//Not Indexed 
		}

}
