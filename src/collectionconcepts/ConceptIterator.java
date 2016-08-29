package collectionconcepts;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;

public class ConceptIterator {

	public static void main(String[] args) {
		ArrayList a1= new ArrayList();
		a1.add(18);
		a1.add(8);
		a1.add(1987);
		a1.add("DOB");
		ListIterator i1=a1.listIterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		while(i1.hasPrevious())
		{
			System.out.println(i1.previous());
		}
		
		
		HashSet h1= new HashSet();
		h1.add(18);
		h1.add(8);
		h1.add(1987);
		h1.add("DOB");
		Iterator i2=h1.iterator();		
		
		while(i2.hasNext())
		{
			System.out.println(i2.next());
		}
		

	}

}
