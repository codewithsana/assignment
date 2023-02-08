package objectandclass;
import java.util.Scanner;
public class Doublevariable {
public static void main(String[] args) {
	//boolean a=(sc1>0 && sc1<1 && sc2>0 && sc2<1);
	Scanner sc= new Scanner(System.in);
	System.out.print("enter the first number:");
	double sc1=sc.nextDouble();
	System.out.print("enter the second number:");
	double sc2=sc.nextDouble();
	System.out.println(sc1>0 && sc1<1 && sc2>0 && sc2<1);
	/*if(sc1>0 && sc1<1 && sc2>0 && sc2<1) {
		System.out.println("conditon accept between 0 and 1");
	}
	else {
		System.out.println(" condition not accept between 0 and 1");
	}*/
}
}
