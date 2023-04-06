package Exception;

public class Exception_Assignment1 {
	public static void main(String[] args)  {
		String str="Sana";
		//Division by zero
		try {
			  int a=100/0;
				 System.out.println(a);
		}
		catch(Exception e)
		{
			System.out.println("Invalid division");
		}
		//String parse to a numeric variable
		try {
				 String s1="Sana";
				 System.out.println(Integer.parseInt(s1));
		}
		catch(Exception e)
		{
			System.out.println("Format mismatch");
		}
		//Accessing an invalid index
		try {		 
		String st="Sana";
		char ch=st.charAt(10);
		}
		catch(Exception e)
		{
			System.out.println("Index is Invalid");
		}
		//Accessing an invalid index in array
		try {
			 int arr[]=new int[5];
   			  arr[7]=10;
		}
		catch(Exception e)
		{
			System.out.println("Array index is invaild");
		}}
		public void custom(int a)throws MyException{
			
		
		try {
			if(a>0)
			throw new MyException("Sana");
		}catch(MyException e) {
			System.out.println("My Exception["+e.getMessage()+"]");
		}
		catch(Exception e) {
			System.out.println("Exception encountered");
		}
		finally {
			System.out.println("Exception handling completed");	
			}}}
class MyException extends Exception{
	//private String Sana;
	public MyException(String str) {
//		this.Sana=Sana;
		super(str);
	}
}
