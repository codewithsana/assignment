package objectandclass;
import java.util.Scanner;
public class Factorial1 {
public static void main(String[] args) {
	System.out.println("enter thhe value");
	Scanner sc= new Scanner(System.in);
	int n=sc.nextInt();
	factorial(n);//method calling
}
public static void factorial(int n) {//method declare
	int fact=1;
	for(int i=1;i<=n;i++) {
		fact=fact*i;
	}
	System.out.println(n+"factorial is:"+fact);
}
}
