package com.cognizant.shapes;
class Rectangle{
double	length;
double breadth;
double area;
void calculateArea(){
area=length*breadth;
System.out.println("the area of rectangle is calculated by using the formula length*breadth:");
System.out.println(area);
}}
public class AreaCalculator {
	public static void main(String args[])
	{
	Rectangle r1= new Rectangle();
	r1.length=7.5;
	r1.breadth=9;
	r1.calculateArea();
	}
}
