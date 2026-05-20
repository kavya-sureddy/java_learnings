package MenthodsFunctions;

public class Employee {

    // 1. Basic method - no params, no return
    public void displayHeader() {
        System.out.println("========== Employee Details ==========");
    }

    // 2. Parameterized method - params, no return
    public void printEmployeeDetails(String name, int empId, String department) {
        System.out.println("Employee Name   : " + name);
        System.out.println("Employee ID     : " + empId);
        System.out.println("Department      : " + department);
    }

    // 3. Params + return type - calculate bonus
    public double calculateBonus(double salary, int performanceRating) {
        double bonusPercent;

        if (performanceRating >= 9) bonusPercent = 20;
        else if (performanceRating >= 7) bonusPercent = 15;
        else if (performanceRating >= 5) bonusPercent = 10;
        else bonusPercent = 5;

        double bonus = (salary * bonusPercent) / 100;
        return bonus;
    }

    public static void main(String[] args) {

        Employee emp = new Employee();  // object created inside static main

        // method 1 - basic
        emp.displayHeader();
     // method 2 - parameterized
        emp.printEmployeeDetails("Kavya", 101, "QA Automation");
        System.out.println("--------------------------------------");

        emp.printEmployeeDetails("Neeru", 102, "Development");
        System.out.println("--------------------------------------");

        emp.printEmployeeDetails("Sunny", 103, "DevOps");
        System.out.println("--------------------------------------");

        // method 3 - return type
        double bonus1 = emp.calculateBonus(75000, 9);
        System.out.println("Kavya's Bonus   : " + bonus1);

        double bonus2 = emp.calculateBonus(80000, 7);
        System.out.println("Neeru's Bonus   : " + bonus2);

        double bonus3 = emp.calculateBonus(70000, 5);
        System.out.println("Sunny's Bonus   : " + bonus3);

        System.out.println("======================================");
    }
}

        // metho
