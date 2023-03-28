package Thread;

public class ThreadTest1 extends Thread{//main class
public void run() {//pre define method
for(int i=0;i<4;i++) {
	try {
		Thread.sleep(100);//break for a time inside single thread
	}catch(InterruptedException e) {
		System.out.println(e);
		}
	System.out.print("ACB");//it will print 5 times ACB
}
System.out.print("ACA");
for(int i=0;i<4;i++) {
	try {
		Thread.sleep(100);//break for a time inside single thread
	}catch(InterruptedException e) {
		System.out.println(e);
	}
	System.out.print("BCA");//it will print 4 times CAB
}
System.out.print("BCB");//one time CB
}
public static void main(String[] args) {//main method
	ThreadTest1 t1= new ThreadTest1();//main method class object
	t1.run();//to call the run method
}
}
