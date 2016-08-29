package collectionconcepts;

import java.util.Hashtable;
import java.util.Map;

public class MapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable <Integer,String> hm= new Hashtable<Integer,String>();
		hm.put(100, "Excellent");
		hm.put(100, "Excellent");
		hm.put(11, "Excellent");
		hm.put(99, "Brilliant");
		hm.put(33, "Passed");
		hm.put(10, "Fali");
		System.out.println(hm.hashCode());
		
		for(Map.Entry m: hm.entrySet())
		{
			System.out.println(m.getKey() +" "+ m.getValue());
		}
		for(Integer m: hm.keySet())
		{
			System.out.println(m.intValue());
		}

	}

}
