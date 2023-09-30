package customizedExceptions;

public class Test2 {

	public static void main(String[] args) throws InterruptedException {
		dostuff();
	}
	public static void dostuff() throws InterruptedException
	{
		domorestuff();
	}
//	throws keyword is used to pass the exception with out providing handling code.
	public static void domorestuff() throws InterruptedException
	{
		Thread.sleep(100);
		System.out.println("threads are slept");
	}

}
