package Exception;
public class Try_Catch {
public static void main(String[] args) {
  try {
	  int i=50/0; //Arithmetic exception
				 System.out.println(i);
		  }
		  catch(ArithmeticException e) {
			  System.out.println(e);
		  }
			  try {    
	   		String s=null; // null pointer Exception
				 System.out.println(s.length());
			  }
			  catch(NullPointerException e) {
				  System.out.println(e);
			  }  
		    try {
	     	  int arr[]=new int[5];//ArrayIndexOutOfBound Exception
			  arr[7]=10;
			  System.out.println(arr);
		    }
		    catch(ArrayIndexOutOfBoundsException e) {
		    	System.out.println(e);
		    }
	     	try {
			  String s1="sana";//number format exception
				 int n=Integer.parseInt(s1);
				 System.out.println(n);
		  }
		  catch(Exception e) {
			  System.out.println(e);
		  }
	     	finally {
	     		System.out.println("Finally block will be executed");
	     	}}}


