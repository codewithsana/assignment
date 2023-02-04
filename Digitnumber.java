package controlstatement;

import java.util.Scanner;

public class Digitnumber {
	public static void main(String[] args) {
  Scanner sc= new Scanner(System.in);
  System.out.println("enter the integer");
int a=sc.nextInt();
String b=Integer.toString(a);
char[] s=b.toCharArray();
System.out.println("the individual char are:");
for(int i=0;i<s.length;i++) {
	System.out.print(s[i]+" ");
}
 sc.close();
	}}