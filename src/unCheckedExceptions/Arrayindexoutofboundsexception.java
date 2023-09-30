package unCheckedExceptions;

public class Arrayindexoutofboundsexception {

	public static void main(String[] args) {
		int arr[]= {2,5,8,9,7,6};
		try
		{
			System.out.println(arr[7]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(arr[3]);
		}
	}

}
