package programs;

import java.util.Arrays;
import java.util.List;

public class ForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list1 = Arrays.asList("a","b","c");
		list1.forEach(item->System.out.println(item));
		
		List<String> list2 = Arrays.asList("a","b","c");
		list2.forEach(System.out::println);
	}

}
