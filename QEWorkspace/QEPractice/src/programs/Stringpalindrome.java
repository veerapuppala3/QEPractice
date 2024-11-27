package programs;

public class Stringpalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "madam";
		String rev=""; 
		for (int i=name.length()-1; i>=0; i--)
		{
			rev = rev + name.charAt(i);
		}
		if(name.equals(rev))
		{
			System.out.println("palindrome");
		}
		else
		System.out.println("not");
	}

}
