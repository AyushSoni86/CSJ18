package Assignment_On_Inheritance;

import java.util.Scanner;

class Emloyee {
    String name;
    int id;
}
class WageEmployee extends Emloyee {
    int rate;
    int hrs;

    int ComputeSalary() {
        return rate * hrs;
    }

    public WageEmployee(String s, int i) {
        System.out.println("The employee name is : " + s);
        System.out.println("Employee ID is : " + i);
    }

    public WageEmployee() {

    }

}
class SalesPerson extends WageEmployee{
    int sales;
    int commission ;

    @Override
    int ComputeSalary() {
        return sales*commission;
    }
}

public class Assignment_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Emloyee employee = new WageEmployee();
        WageEmployee emp = new WageEmployee(" Ayush Soni ", 16440);
        WageEmployee employ = new SalesPerson();
        System.out.println("Enter the rate of work for the Employee in rs: ");
//        employ.sales = sc.nextInt();
//        employ.commision = sc.nextInt();
        System.out.println("Enter the Employee worked hours : ");
        emp.hrs = sc.nextInt();
        System.out.println("Salary of employee is "+ emp.ComputeSalary());
    }
}
