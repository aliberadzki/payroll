package pl.aliberadzki.payroll;

/**
 * Created by aliberadzki on 02.07.16.
 */
public class AddTimeCardTransaction implements Transaction {
    private int itsDate;
    private double itsHours;
    private int itsEmpId;

    public AddTimeCardTransaction(int date, double hours, int empId) {
        this.itsDate = date;
        this.itsHours = hours;
        this.itsEmpId = empId;
    }

    @Override
    public void execute() throws Exception {
        Employee e = PayrollDatabase.instance().getEmployee(this.itsEmpId);
        if(e == null) throw new Exception("Nie ma takiego pracownika");

        PaymentClassification pc = e.getClassification();
        if(!(pc instanceof HourlyClassification)) throw new Exception("Nie można dodać karty czasu pracy dla pracownika nie rozliczającego się godzinowo");
        HourlyClassification hc = (HourlyClassification) pc;

        hc.addTimeCard(new TimeCard(itsDate, itsHours));
    }
}