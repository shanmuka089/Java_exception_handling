package checkedExceptions;
import java.io.*;
public class Filenotfoundexception {
	public static void main(String[] args) throws FileNotFoundException {
		try
		{
			FileInputStream f=new FileInputStream("/desktop/Gfg.txt");
		}
		catch(FileNotFoundException e)
		{
			System.out.println("file not exist");
		}
	}
}
