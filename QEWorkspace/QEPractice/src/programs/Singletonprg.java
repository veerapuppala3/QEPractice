package programs;
class Singleton{
	
	private Singleton()
	{
		
	}
	private static Singleton single = null;
	public static Singleton getInstance()
	{
		
		if(single==null)
		{
			System.out.println("Singeton");
			return single = new Singleton();	
		}
		else
			return single;
	}
}
public class Singletonprg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleton obj = Singleton.getInstance();

	}

}
