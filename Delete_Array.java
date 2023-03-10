package Array;
import java.util.Scanner;
public class Delete_Array {
	public static void main(String[] args)
	{
System.out.println("enter the size of an array:"); 
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int arr[] = new int[n];
System.out.println("enter the element of an array:");
for(int i=0;i<n;i++) {
arr[i]=sc.nextInt();
}
 System.out.println("Enter the Element to Remove:");
 int e=sc.nextInt();
 for(int i=0;i<arr.length;i++)
{
   if(arr[i]==e)
  {
// for(int j=1; j<(n-1); j++) {
//arr[j] = arr[j+1];
 //System.out.println(arr[j]);
// System.out.println("\nRemoved the element successfully!");
 //break;
  }}   
//}
	   System.out.println("The new array is: ");
	   for( int i=0;i<arr[i];i++)
	   System.out.print(i+ " ");
   }}
