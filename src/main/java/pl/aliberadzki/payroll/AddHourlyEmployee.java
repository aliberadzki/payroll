package pl.aliberadzki.payroll;

/**
 * Created by aliberadzki on 01.07.16.
 */
public class AddHourlyEmployee extends AddEmployeeTransaction {

    private double itsRate;

    public AddHourlyEmployee(int empid, String name, String address, double rate) {
        super(empid, name, address);
        this.itsRate = rate;
    }

    @Override
    public PaymentClassification getClassification() {
        return new HourlyClassification(itsRate);
    }

    @Override
    public PaymentSchedule getSchedule() {
        return new HourlySchedule();
    }
}
