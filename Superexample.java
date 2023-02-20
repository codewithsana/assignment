package objectandclass;
class Super1{//parent class
	int a=10;//instance variable
	int b=5;
	Super1(){//parent constructor
		int c=a+b;
		System.out.println("the addition is:"+c);
	}
}
class Super2 extends Super1{//child class1
	int d;
	Super2(){//child constructor
		d=a*b;
		System.out.println("the multiplication is:"+d);
	}
}
class Super3 extends Super2{//child class2
	int e;
	Super3(){//child constructor
		super();//invoke immediate parent class constructor
		e=a-b;
		System.out.println("the subtraction is:"+e);
	}
}
public class Superexample {//main class
public static void main(String[] args) {//main method
	Super3 s1= new Super3();//child class object
}
}
