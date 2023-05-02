package exception;

public class ExceptionDemo {

	public static void main(String[] args) {
	/*	int arr[]=new int[5];
		arr[10]=50;//ArrayindexOutOfBoundException
		String str=null;
		System.out.println(str.charAt(0));//NullPointerException
		int x=3/0;
		System.out.println(x);//ArithmeticException
		String s1="hii";
		int y=Integer.parseInt(s1);//NumberFormatException
		System.out.println(y);*/
		try {
			int arr[] = new int[5];
			arr[1] = 50;
			int x =50/5;
			System.out.println("The Value of x :"+x);
			String str = null;
			System.out.println(str.length());
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			//System.out.println(e.getMessage());
			System.out.println("Please check the index of the array");	
		}
		catch(ArithmeticException e)
		{
			System.out.println("Value cannot be divided by Zero!");
		}
 //Exception is like the parent class which contains all of the exception
//if you do not know which exception is to be used we can simply do as below
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		System.out.println("Rest of Code");
		int a =10,b=20;
		System.out.println("Addition : "+(a+b));
	}

}
