package Thread;
//program to  print the even and odd number using thread
class EvenThread extends Thread{//class1
	public void run() {//pre define method
		for(int i=2;i<=100;i++) {
			try {
				if(i%2==0) { //condition to  print the even number
					//Running statement
					//inside one thread print gap one after another
				Thread.sleep(150);
				System.out.print(i);
				System.out.print(" ");
			}
			else{
				System.out.print("");
			}
		}catch(InterruptedException e) {//if any exception occur
				System.out.println(e);
			}}
		System.out.println();}}
		class OddThread extends Thread{//class2
			
			public void run() {//pre define method
				for(int i=1;i<=100;i++) {//condition to  print the even number 
					try {
						if(i%2!=0) { 
							//Running statement
							//inside one thread print gap one after another
						Thread.sleep(150);
						System.out.print(i);
						System.out.print(" ");
					}
					else{
						System.out.print("");
					}
				}catch(InterruptedException e) {//if any exception occur
					
						System.out.println(e);
					}}
		System.out.println(" ");}}
public class Thread_Main {//main class
	public static void main(String[] args) {//main method
		EvenThread t1= new EvenThread();//class1 object
		OddThread t2= new OddThread();//class2 object
		System.out.println("Even number: ");
		t1.start();//for even number
		try {
			t1.join();
		}catch(InterruptedException e) {
			System.out.println(e);
		}
		System.out.println("Odd number: ");
		t2.start();//for odd number
	}}
