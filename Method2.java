package objectandclass;

import java.util.Scanner;

public class Method2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);//value take by user
		System.out.println("enter the value");
		int num=sc.nextInt();
		primenumber(num);//method call
	}
public static void primenumber(int num) {
	//method create
	int count=0;
	for(int i=1;i<=num;i++) {
			if(num%i==0) {
			count++;
			}}
		if(count==2)
			{
			System.out.println(num+"is prime number");}
			else
			{
				System.out.println(num+"is not prime number");
			}

}}
