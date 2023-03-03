package oops;
//no need to declare the array inside the method
public class Array_Anonymous {
static void print(int arr[]) {
	for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]);
	}
}
public static void main(String[] args) {
	//passing 
	print(new int[] {10,20,30,40,50,60,70,80});
}
}
