package collectionconcepts;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.PriorityQueue;

public class ListMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a1= new ArrayList();
		a1.add("roushan");
		a1.add("TCS");
		
		ArrayList<String>a2= new ArrayList();
		a2.add("roushan");
		a2.add("KIIT");

		
//		a1.retainAll(a2);
//		Iterator i1= a1.iterator();
//		while(i1.hasNext())
//		{
//			System.out.println(i1.next());
//		}
		a1.removeAll(a2);
		Iterator i2= a1.iterator();
		while(i2.hasNext())
		{
			System.out.println(i2.next());
		}
		
		HashSet <String> hs1= new HashSet();
		hs1.add("roushan");
		hs1.add("roushan");
		hs1.add("TCS");
		hs1.add("KP4");
		for(String s: hs1)
		{
			System.out.println(s);
		}
		PriorityQueue<String> queue=new PriorityQueue<String>();  
		queue.add("Amit");  
		
		queue.add("Aijay");  
		queue.add("Karan");  
		queue.add("Jai");  
		queue.add("Rahul");  
		  
		System.out.println("iterating the queue elements:");  
		Iterator itr=queue.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  
		  
		queue.remove();  
		queue.poll();  
		  
		System.out.println("after removing two elements:");  
		Iterator<String> itr2=queue.iterator();  
		while(itr2.hasNext()){  
		System.out.println(itr2.next());  
		}  
		  
		}  
		

	}


