package programs;

@FunctionalInterface
interface Withoutlamdba{
	public void message();
}

class WithoutlamdbaImpl implements Withoutlamdba{

	@Override
	public void message() {
			System.out.println("Hello without lambda");
	}
	
}

public class FunctionalInterfacewithoutLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Withoutlamdba obj = new WithoutlamdbaImpl();
		obj.message();
	}

}
