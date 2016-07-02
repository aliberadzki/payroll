package pl.aliberadzki.payroll;

/**
 * Created by aliberadzki on 01.07.16.
 */
public class AddCommisionedEmployee extends AddEmployeeTransaction {
    @Override
    public PaymentClassification getClassification() {
        return null;
    }

    @Override
    public PaymentSchedule getSchedule() {
        return new BiweeklySchedule();
    }
}
