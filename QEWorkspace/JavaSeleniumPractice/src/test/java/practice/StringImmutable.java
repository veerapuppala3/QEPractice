package practice;

public class StringImmutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Hello";
		String ss = "Hello";
		//System.out.println(s.concat(s));
		String s2 = s.concat("Rao");
		System.out.println(s.hashCode());
		System.out.println(ss.hashCode());

	}

}
