package controlstatement;

import java.util.Scanner;// use to take input from user

public class Naturalnumber {
	public static void main(String[] args) {
		int i;
		int sum=0;
		int number;
		Scanner sc= new Scanner(System.in);//taken unput from the user
		System.out.println("enter first 10 natural number");
		 number=sc.nextInt();
		for(i=1;i<=number;i++) {
			sum+=i;}
		System.out.println("sum is:"+sum);
		
			
		sc.close();
	}

}
