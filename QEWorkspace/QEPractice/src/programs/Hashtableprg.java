package programs;

import java.util.Hashtable;
import java.util.Set;

public class Hashtableprg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
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