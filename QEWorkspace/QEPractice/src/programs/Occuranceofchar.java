package programs;

import java.util.HashMap;
import java.util.Map;

public class Occuranceofchar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		String name = "veerapuppala";
		char[] characters = name.toCharArray();

		for(char c:characters)
		{
			if(c!=' ') {

				if(map.containsKey(c)) {
					map.put(c, map.get(c)+1);
				}
				else
					map.put(c, 1);	
			}
		}
		for(Map.Entry entry: map.entrySet())
		{
			System.out.println("Occurance of "+entry.getKey()+ " = "+entry.getValue());
		}
	}
}
