package pl.aliberadzki.payroll;

/**
 * Created by aliberadzki on 09.07.16.
 */
public class AddSalesReceiptTransaction implements Transaction {
    private double itsSalesAmount;
    private int itsEmpid;
    private Integer itsDate;

    public AddSalesReceiptTransaction(int empid, Integer date, double salesAmount) {
        this.itsEmpid = empid;
        this.itsDate = date;
        this.itsSalesAmount = salesAmount;
    }

    @Override
    public void execute() throws Exception {
        Employee e = PayrollDatabase.instance().getEmployee(this.itsEmpid);
        if(e==null) throw new Exception("Nie ma takiego pracownika");

        PaymentClassification pc = e.getClassification();

        if(!(pc instanceof CommissionedClassification)) throw new Exception("Nie można dodać transakcji sprzedaży dla pracownika nie rozliczającego się prowizyjnie!");

        CommissionedClassification cc = (CommissionedClassification) pc;
        SalesReceipt sr = new SalesReceipt(itsDate, itsSalesAmount);
        cc.addSalesReceipt(sr);
    }
}
