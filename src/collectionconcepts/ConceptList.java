package collectionconcepts;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class ConceptList {

	public static void main(String[] args) {
		ArrayList a1= new ArrayList();
		a1.add(25);
		a1.add(25);
		a1.add(34.4);
		a1.add(2, "Check");
		a1.add(34.4);
		for(int i=0; i<a1.size();i++)
		{
			System.out.println(a1.get(i));
						
		}
		System.out.println(a1);
		
		
		LinkedList l1= new LinkedList();
		l1.add(31);
		l1.addAll(a1);
		System.out.println(l1);
		for(int i=0; i<l1.size();i++)
		{
			System.out.println(l1.get(i));
						
		}
		System.out.println(l1.contains(25));
		
		ArrayList<String>a2= new ArrayList();
		a2.add("rk");
		
		Iterator i2=a2.iterator();
		while(i2.hasNext())
		{
			System.out.println(i2.next());
		}
		System.out.println(a2);

	}

}
