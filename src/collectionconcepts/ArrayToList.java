package collectionconcepts;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

public class ArrayToList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String []sArray= {"toit","pub","tasty"};
		TreeSet <String>ts= new TreeSet<String>();
		ArrayList<String>as= new ArrayList<String>();
		for(int i= 0; i<sArray.length;i++)
		{
			as.add(sArray[sArray.length-i-1]);
			ts.add(sArray[sArray.length-i-1]);
			System.out.println(sArray[i]);
		}
		System.out.println("in sorted order");
		Iterator itr= ts.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		Iterator itr2= as.iterator();
		System.out.println("in reverse order ");
		while(itr2.hasNext())
		{			
			System.out.println(itr2.next());
		}


	}

}
