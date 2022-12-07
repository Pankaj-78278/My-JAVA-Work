package Q1;

public class PermanentEmployee extends Employee{
    private double basicPay;

    public PermanentEmployee(int employeeId, String employeeName, double basicPay) {
        super(employeeId, employeeName);
    }
//    salary = basicPay – PF amount;
//    Set this value to the salary attribute.
//    Here PF Amount = basicPay * 0.12

    @Override
    void calculateSalary() {
        double PFAmount= basicPay*(0.12);
        double salary= basicPay-PFAmount;
    }


}
