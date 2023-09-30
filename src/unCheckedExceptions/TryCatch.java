package unCheckedExceptions;
public class TryCatch{
	public static void main(String[] args){
		int i=5;
		int [] arr=new int[i];
		try
		{
			try
			{
				arr[6]=10;
				System.out.println("value is"+(10/0));
				System.out.println(arr[6]);
			}catch(ArithmeticException e) {
				System.out.println("div / 0");
			}
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array bounds");
		}
	}
}
