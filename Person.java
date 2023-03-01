package mypackage;

public class Person {//class1
private String name;//instance variable
private int age;
 Person (String name,int age) {//perametrized constructor
	this.name=name;
	this.age=age;
	 System.out.println("name: "+name);
	System.out.println("age: "+age);
}
}
