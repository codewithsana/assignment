package objectandclass;
class Employee2{//creating class
long employeeId;//instance variable
String employeeName;
String employeeAddress;
Long employeePhone;
double basicSalary;
double specialAllowance=250.80;
double Hra=1000.50;
//double TransportAllowance;
public Employee2(long ID,String name,String address,long phone,double salary) {//overloaded constructor
this.employeeId=ID;//using this keyword
this.employeeName=name;
this.employeeAddress=address;
this.employeePhone=phone;
this.basicSalary=salary;
}
void calculatesalary() {//user define method
	double salary=basicSalary+(basicSalary*specialAllowance/100)+(basicSalary*Hra/100);
	System.out.println("the total salary of "+employeeName+":-"+salary);
}
void calculateTransportAllowance() {//user define method
	double TransportAllowance=10/100*basicSalary;
	System.out.println("transport allowance of"+employeeName+"manager:"+TransportAllowance);
}}
class Manager extends Employee2{//class child 1
public Manager(long ID,String name,String address,long phone,double salary)	{
	super(ID,name,address,phone,salary);
}
void calculateTransportAllowance() {
	double TransportAllowance=15*basicSalary/100;
	System.out.println("transport allowance of"+employeeName+" manager:-"+TransportAllowance);
}}
class Trainee extends Employee2{//class child 2
public Trainee(long ID,String name,String address,long phone,double salary) {
	super(ID,name,address,phone,salary);
}
void calculatesalary() {//user define method
	double salary=basicSalary+(basicSalary*specialAllowance/100)+(basicSalary*Hra/100);
	System.out.println("the total salary of "+employeeName+":-"+salary);
}
void calculateTransportAllowance() {//user define method
	double TransportAllowance=15*basicSalary/100;
	System.out.println("transport allowance of"+employeeName+" trainee:-"+TransportAllowance);
}
}
public class InheritanceActivity {//main class
public static void main(String[] args) {//main method
Manager m1= new Manager(123456,"peter","chennai india",237844,65000.00);//child1 object
m1.calculatesalary();
m1.calculateTransportAllowance();
Trainee t1= new Trainee(29846,"jack","mumbai india",442085,45000.00);//child2 object
t1.calculatesalary();
t1.calculateTransportAllowance();
}}
