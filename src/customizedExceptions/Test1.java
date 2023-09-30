package customizedExceptions;
class InsufficientBalanceException extends RuntimeException
{
	InsufficientBalanceException()
	{
		
	}
	InsufficientBalanceException(String msg)
	{
		super(msg);
	}
}
//	our exception object must be throwable type so it must be extends RuntimeException class.
class ValidAmount extends RuntimeException
{
	ValidAmount(String msg)
	{
		super(msg);
	}
}
public class Test1 {
	public static void main(String[] args)
	{
		int i=Integer.parseInt("100000");
		if(i>10000)
		{
//			sometimes we want to create our own exception object explicitly.
//			we can hand over that exception object to JVM manually for that purpose we use exception object.
			throw new InsufficientBalanceException("eneter a valid amount");
		}else if(i<0){
			throw new ValidAmount("eneter a valid amount");
		}
		else {
			System.out.println("processed the amount");
		}
	}
}
