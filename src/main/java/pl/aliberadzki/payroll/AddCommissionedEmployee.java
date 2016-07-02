package pl.aliberadzki.payroll;

/**
 * Created by aliberadzki on 01.07.16.
 */
public class AddCommissionedEmployee extends AddEmployeeTransaction {
    private double itsSalary;
    private double itsRate;

    public AddCommissionedEmployee(int empid, String name, String address, double salary, double rate) {
        super(empid, name, address);
        this.itsRate = rate;
        this.itsSalary = salary;
    }

    @Override
    public PaymentClassification getClassification() {
        return new CommissionedClassification(itsSalary, itsRate);
    }

    @Override
    public PaymentSchedule getSchedule() {
        return new BiweeklySchedule();
    }
}
