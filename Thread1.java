package Thread;

public class Thread1 extends Thread {
public void run() {//pre define method
	System.out.println("i am thread....thread is running");
}

public static void main(String[] args) {//man method
	Thread1 t= new Thread1();//main class object
	t.run();//call the run method
	Thread t1= new Thread("I am thread 1");//create class and pass the perameter
	Thread t2= new Thread("I am thread 2");
	t1.start();//move the thread  to the active state
	System.out.println("First Thread: "+t1.getName());//to show the thread1
	t2.start();//move the thread  to the active state
	System.out.println("Second Thread: "+t2.getName());//to show the thread2
	}
}
