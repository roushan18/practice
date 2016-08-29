package collectionconcepts;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class ConceptSet {

	public static void main(String[] args) {
		HashSet hs= new HashSet();
		LinkedHashSet lhs= new LinkedHashSet();
		TreeSet ts= new TreeSet();
		
		//HashSet- heterogeneous data but random storage, no duplicate record//
		hs.add(55);
		hs.add("S");
		hs.add(5.65);
		hs.add('C');
		hs.add(5.65);//duplicate data//
		System.out.println(hs);
		System.out.println(hs.size());
		
		//LinkedHashSet- heterogeneous data, insertion, no duplicate record//
		lhs.add("Start");
		lhs.add('K');
		lhs.add(0);
		lhs.add("END");
		System.out.println(lhs);
		
		//TreeSet- homogeneous data, sorted, no duplicate record
		//** Difference between Queue and TreeSet**********
		ts.add(34);
		ts.add(45);
		ts.add(45);
		ts.add(5);
		ts.add(5);
		System.out.println(ts);
		System.out.println(ts.size());
	}

}
