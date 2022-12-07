package Q1;

public abstract class TemporaryEmployee extends Employee{
//    Create another class TemporaryEmployee as a child of Employee class with
//the following private fields:
//    hoursWorked: Integer
//    hourlyWages: Integer
    private int hoursWorked;
    private   int hourlyWages;

    public TemporaryEmployee(int employeeId, String employeeName,int hoursWorked,int hourlyWages) {
        super(employeeId, employeeName);
    }
//    salary = hoursWorked * hourlyWages
//    Set this value to the salary attribute.

    @Override
    void calculateSalary() {
        double salary= hoursWorked+hourlyWages;
    }
}
