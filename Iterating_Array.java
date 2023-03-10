package Array;
import java.util.Scanner;
public class Iterating_Array {
public static void main(String[] args) { 
	System.out.println("enter the size of an array: "); 
	Scanner sc = new Scanner(System.in);//take input from user
	int n = sc.nextInt();
	int arr1[] = new int[n];//first array
	int arr2[] = new int[arr1.length];//second array
	System.out.println("enter the element of an array:");
	for(int i=0; i<n; i++) {
	arr1[i] = sc.nextInt();
	}
    for (int i=0;i<arr1.length;i++) {     
        arr2[i] = arr1[i];  //value of arr1 convert into arr2   
    }       
    System.out.println("Elements of original array: ");    
    for (int i=0;i<arr1.length;i++) {     
       System.out.print(arr1[i]+" "); //show the element of arr1   
    }     
 System.out.println();//for new line         
    System.out.println("Elements of new array: ");    
    for (int i=0;i<arr2.length;i++) { //show the element of arr2    
       System.out.print(arr2[i]+" ");    
    }}}
