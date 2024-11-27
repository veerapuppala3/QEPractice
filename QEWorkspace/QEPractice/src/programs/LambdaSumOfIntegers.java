package programs;

interface SumOfintegers{
	public int addition(int a, int b);
}
public class LambdaSumOfIntegers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumOfintegers add = (a, b)-> {return (a + b); };
		System.out.println(add.addition(5, 3));
	}

}
