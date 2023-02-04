package controlstatement;

import java.util.Scanner;

public class Greater {
public static void main(String[] args) {
	int num,num1;
	System.out.println("enter the value of a");
	Scanner sc=new Scanner(System.in);
	num=sc.nextInt();
	System.out.println("enter the value of a");
	num1=sc.nextInt();
	if(num>num1) {
		System.out.println("grater value is:"+num);
	}
	else {
		System.out.println("less value is:"+num1);
	}
}
}
