package oops;
abstract class Shape1{//abstract class
	abstract void calculateArea();//abstract method
}
class Circle1 extends Shape1{
	void calculateArea() {//implement of abstract method
		int r=2;
		double area=3.14*r*r;
		System.out.println("Area of circle:"+area);
	}
}
class Rectangle extends Shape1{
	void calculateArea() {//implement of abstract method
		int length=3;
		int width=2;
		int area= length*width;
		System.out.println("Area of rectangle:"+area);
	}
}
public class Area {//main class
public static void main(String[] args) {//main method
	Circle1 c1 = new Circle1();
	Rectangle r1= new Rectangle();
	c1.calculateArea();
	r1.calculateArea();
}
}
