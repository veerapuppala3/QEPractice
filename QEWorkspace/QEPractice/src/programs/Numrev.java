package programs;

public class Numrev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 5842345;
		int rev = 0;
		int sum = 0;
		while(num!=0)
		{
			rev = rev * 10;
			rev = rev + num%10;
			//sum = sum + num%10;
			num = num/10;
		}
		System.out.println(rev);
		//System.out.println(sum);
	}

}
