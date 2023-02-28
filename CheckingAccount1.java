package oops;
interface BankAccount1{
	void deposite();//by default abstract method
	void withdraw();//by default abstract method
}
public class CheckingAccount1 implements BankAccount1 {
	public void deposite() {//implementation
		
		int balance=30000;
		int deposite=1000+balance;
		
		System.out.println("deposite balance is:"+deposite);
	}
	
	public void withdraw() {//implementation
		
		int balance=30000;
		int deposite=balance-1000;
		
		System.out.println("withdraw balance is:"+deposite);
	}
	public static void main(String[] args) {//main method
		BankAccount1 b1= new CheckingAccount1();
		b1.deposite();
		b1.withdraw();
	}
	}


