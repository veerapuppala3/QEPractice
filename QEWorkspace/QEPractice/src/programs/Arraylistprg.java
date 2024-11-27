package programs;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylistprg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> al = new ArrayList<String>();
				al.add("a");
				al.add("b");
				al.add("c");
				al.add("d");	
				al.add("e");
				
		Iterator<String>ir = al.iterator();
		while(ir.hasNext())
		{
			String item = ir.next();
			System.out.println(item);
		}
				
		
	}

}
