package Exception;

public class Exception_Assignment {
	public void display() {  //method
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
		//Accessing an invalid calculation
		try {		 
		int b=(12+3)/0;
				 System.out.println(b);
		}
		catch(Exception e)
		{
			System.out.println("calculation invaild");
		}
		//Accessing an invalid index in array
		try {
			 int arr[]=new int[5];
   			  arr[7]=10;
		}
		catch(Exception e)
		{
			System.out.println("Array index is invaild");
		}
		String m="Exception Handling Completed";
		  System.out.println(m);
	}
	public static void main(String[] args) {
		Exception_Assignment ob=new Exception_Assignment();
		ob.display();
	}
}
