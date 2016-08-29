package collectionconcepts;

import java.util.PriorityQueue;

public class ConceptQueue {

	public static void main(String[] args) {
		PriorityQueue pq= new PriorityQueue();
		pq.add(56);
		pq.add(22);
		pq.add(56);
		pq.add(22);//Allows Duplicate data
		

		while(pq.peek()!=null)
		{
			System.out.println(pq.poll());
			
		}

	}

}
