package objectandclass;
class Parent{//parent class
	int a=10;//instance variable
	int b=5;
}
class Child1 extends Parent{//child class
	int c=3;
	int d=a+b+c;
}
public class Single_inheritance1 {//main class
public static void main(String[] args) {//main methpd
	Child1 c1= new Child1();//object of child class
	System.out.println("the value of a is:"+c1.a);
	System.out.println("the value of b is:"+c1.b);
	System.out.println("the value of c is:"+c1.c);
	System.out.println("the sum is:"+c1.d);
}
}
