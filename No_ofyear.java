package controlstatement;

import java.util.Scanner;

public class No_ofyear {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("input the time of minutes");
	int year=60*24*365;
	int min=sc.nextInt();
    int years=(min/year);
    int day=(min/60/24)%365;
    System.out.println("years:->"+ years);
    System.out.println("days:->"+ day);	
	}

}
