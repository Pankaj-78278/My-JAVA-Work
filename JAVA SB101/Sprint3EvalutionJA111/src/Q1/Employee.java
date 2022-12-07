package Q1;
//Create an Employee class with the following fields:
//        employeeId: Integer
//        employeeName: String
//        salary: double

abstract public class Employee {
    int employeeId;
    String employeeName;
    double salary;

    abstract void calculateSalary();

    public Employee(int employeeId, String employeeName) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
    }
}
