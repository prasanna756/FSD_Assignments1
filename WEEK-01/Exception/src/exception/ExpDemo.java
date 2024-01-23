package exception;

public class ExpDemo {
	public static void main(String[] args) {
	System.out.println("Open File");
	System.out.println("Read data from file");
	int result=0;
	try 
	{
		String s1=null;
		if(s1!=null) {
		System.out.println(s1.length());
		}
		else {
			System.out.println("String is null");
		}
		result= div(10,0);
		System.out.println(result);
	}
	catch(ArithmeticException e)
	{
		System.err.println("you can't divide a number by zero");
	}
	catch(NullPointerException e)
	{
		e.printStackTrace();
	}
	finally {
		System.out.println("Close file");
		}
	
}
	public static int div(int x, int y) throws ArithmeticException
	{
		return x/y;
	}
}