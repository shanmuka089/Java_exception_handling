package unCheckedExceptions;

public class ThrowableClassMethods {

	public static void main(String[] args) {
		try
		{
			System.out.println(10/0);
		}
		catch(ArithmeticException e)
		{
			
			System.out.println(e); //internally throwable class toString method executes
			System.out.println(e.getMessage());
			e.printStackTrace();
			
		}
	}

}
