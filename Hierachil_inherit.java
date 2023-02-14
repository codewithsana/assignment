package objectandclass;
class A1{//parent class
	int id=101;
	String name="rita";
}
class B extends A1{// child class1
	int salary=10000;
}
class C extends A1{//child class2
	String company="Wipro";
}
public class Hierachil_inherit {//main class
public static void main(String[] args) {//main method
	B b1= new B();//object class1
	System.out.print(b1.id+" "+b1.name+" "+b1.salary);
	C c1= new C();//object class2
	System.out.print("  "+c1.company);
}
}
