package controlstatement;

public class Expression2 {
	public static void main(String[] args) {
     int i=(101+0)/3;
	double t= 3.0e-6*10000000.1;
	boolean a=true&&true;
	boolean b=false&&true;
	boolean c=(false&&false)||(true&&true);
	boolean d=(false||false)&&(true&&true);
	System.out.println("(101+0)/3:->"+i);
	System.out.println("3.0e-6*10000000.1->"+t);
	System.out.println("true&&true:->"+a);
	System.out.println("false&&true:->"+b);
	System.out.println("(false&&false)||(true&&true)->"+c);
	System.out.println("(false||false)&&(true&&true)->"+d);
	
}}
