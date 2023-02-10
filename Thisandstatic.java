package objectandclass;
class Thisandstatic1{//class 1
int id;//declare instance variable
double salary;
String emp_name;
static String company="WIPRO";//static keyword
// parameterized constructor
Thisandstatic1(int id,String emp_name,double salary){
this.id=id;
this.emp_name=emp_name;
this.salary=salary;
}
void display() {// user define method
System.out.println(id+" "+emp_name+" "+salary+" "+company);
}}
 public class Thisandstatic{//main class
public static void main(String[] args) {
//create object
 Thisandstatic1 s1= new  Thisandstatic1(131,"Rahul",50000.70);
 Thisandstatic1 s2= new  Thisandstatic1(543,"Vicky",25000.50);
s1.display();//display the data
System.out.println();
s2.display();
}
}

