package collectionconcepts;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapConcepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap <String,List>hm= new HashMap<String,List>();
		String s1="roushan kumar";
		String s2= "jha";
		List<String> l= new ArrayList<String>();
		l.add(s1);
		l.add(s2);
		hm.put("TC01",l );
		hm.put("TC02",l );
		
		for(Map.Entry m: hm.entrySet() )
		{
			System.out.println("Testcase : "+m.getKey() +"Data: "+m.getValue());
		}

	}

}
