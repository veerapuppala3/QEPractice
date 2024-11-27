package programs;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streamsprg1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//In the given example, we are creating a stream of a fixed number of integers.
		Stream<Integer> stream1 = Stream.of(1,2,3,4,5,6,7);
		stream1.forEach(item->System.out.println(item));
		
		//In the given example, we are creating a stream from the array.
		
		Stream<Integer> stream2 = Stream.of(new Integer[] {1,2,3,4,5,6});
		stream2.forEach(item->System.out.println(item));
		
		//In the given example, we are creating a stream from the List. 
		List<Integer> ls = new ArrayList<Integer>();
		for(int i=0;i<10;i++)
		{
			ls.add(i);
		}
		Stream<Integer> st = ls.stream();
		st.forEach(num->System.out.println(num));
		
		// collecting all even numbers into a List.
		
		Stream<Integer> est = ls.stream();
		List<Integer> evennum = est.filter(e->e%2==0).collect(Collectors.toList());
		System.out.println(evennum);
		
		
		List<String> memberNames = new ArrayList<>();
		memberNames.add("Amitabh");
		memberNames.add("Shekhar");
		memberNames.add("Aman");
		memberNames.add("Rahul");
		memberNames.add("Shahrukh");
		memberNames.add("Salman");
		memberNames.add("Yana");
		memberNames.add("Lokesh");
		
		//memberNames.stream().filter(n->n.startsWith("A")).forEach(System.out::println);
		List<String> names = memberNames.stream().filter(n->n.startsWith("A")).toList();
		System.out.println(names);
	}

}
