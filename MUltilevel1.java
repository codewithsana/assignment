package objectandclass;
class Pclass2{//parent class
	int id=101;//instance variable
}
class Pclass extends Pclass2{//child1 class
String name="sana";//instance variable
}
public class MUltilevel1  extends Pclass {//main and child class
double salary=30000.50;//instance variable
public static void main(String[] args) {//main method
MUltilevel1  m1= new MUltilevel1() ;//child class object
System.out.println("id is:"+m1.id);
System.out.println("name is:"+m1.name);
System.out.println("salry is:"+m1.salary);
}
}
