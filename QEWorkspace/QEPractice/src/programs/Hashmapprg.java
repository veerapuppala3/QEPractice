package programs;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Set;

public class Hashmapprg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> ht = new HashMap<Integer, String>();
		ht.put(1, "one");
		ht.put(2, "two");
		ht.put(5, "five");
		ht.put(3, "three");
		ht.put(4, "four");
		
		Set<Integer> keys = ht.keySet();
		for(Integer key: keys)
		{
			System.out.println(key+"="+ht.get(key));
		}

	}

}
