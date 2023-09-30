package unCheckedExceptions;

import java.util.Scanner;

public class NestedTryCatch {

	public static void main(String[] args) {
		System.out.println(ram());
		
		Scanner sc=new Scanner(System.in);
		try
		{
			try 
			{
				System.out.println("inner try block");
				System.out.println(10/0);
			}
			catch(ArithmeticException e)
			{
				System.out.println("inner catch block1");
			}
			
			catch(ArrayIndexOutOfBoundsException e)
			{
				e.printStackTrace();
				System.out.println("inner catch block2");
			}
			System.out.println("outer try block");
			
		}
		catch(ArithmeticException e)
		{
			System.out.println("outer catch block");
		}
		finally
		{
			System.out.println("its final block");
		}
	}
	public static int ram()
	{
		try {
			System.out.println("try output");
			return 1;
		}finally {
			System.out.println("finally output");
			return 2;
		}
	}
}
