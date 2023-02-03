package controlstatement;

import java.util.Scanner;

public class Multiply {
public static void main(String[] args) {
	int number;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	number=sc.nextInt();
	System.out.println("table is:");
	for(int i=1;i<=10;i++){
		System.out.println(number*i);	
	}
	sc.close();
	
}
}
