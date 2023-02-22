package objectandclass;
class TaxCalculator {//class 1
     float basicSalary;//instance variable
     boolean citizenship;
     float tax;
     int nettSalary;
public TaxCalculator(float basicSalary, boolean citizenship) {//perameterized constructor
        this.basicSalary = basicSalary;
        this.citizenship = citizenship;  }
 public void calculateTax() {//user define method
        tax = 30 * basicSalary / 100;
        System.out.println("The Tax of the employee for the " + basicSalary + " is " + tax); }
 public void deductTax() {//user define method
        nettSalary = (int) (basicSalary - tax);
        System.out.println("The nett salary of the employee " + nettSalary); }
    public void validateSalary() {//user define method
        boolean response = (basicSalary > 100000 && citizenship);
        System.out.println("The salary and citizenship eligibility: " + response);
    }}
public class EmployeeTax {//main class
	public static void main(String[] args) {//main method
        TaxCalculator calculator = new TaxCalculator(25000, true);//object of class1
        calculator.calculateTax();
        calculator.deductTax();
        calculator.validateSalary();
        
        calculator = new TaxCalculator(125000, true);
        calculator.calculateTax();
        calculator.deductTax();
        calculator.validateSalary();
    }}
