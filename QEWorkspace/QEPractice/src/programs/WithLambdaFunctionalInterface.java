package programs;

interface WithLambda{
	public void message();
}

public class WithLambdaFunctionalInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WithLambda obj = () -> System.out.println("Hello Lambda");
		obj.message();
	}

}
