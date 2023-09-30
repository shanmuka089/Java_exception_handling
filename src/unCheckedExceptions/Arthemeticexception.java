package unCheckedExceptions;

public class Arthemeticexception {

	public static void main(String[] args) {
		m1();
	}
	public static void m1()
	{
		m2();
	}
	public static void m2()
	{
		try
		{
		System.out.println(10/0);
		}
		catch(ArithmeticException e)
		{
			System.out.println(10/2);
		}
	}

}
