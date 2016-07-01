package pl.aliberadzki.payroll;

/**
 * Created by aliberadzki on 01.07.16.
 */
public abstract class AddEmployeeTransaction implements Transaction {
    private int itsEmpid;
    private String itsName;
    private String itsAddress;

    public AddEmployeeTransaction(int empId, String name, String address) {
        this.itsAddress = address;
        this.itsEmpid = empId;
        this.itsName = name;
    }

    public abstract PaymentClassification getClassification();

    public abstract PaymentSchedule getSchedule();

    public void execute(){
        PaymentClassification pc = getClassification();
        PaymentSchedule ps = getSchedule();
        PaymentMethod pm = new HoldMethod();

        Employee e = new RegularEmployee(itsEmpid, itsName, itsAddress);
        e.setClassification(pc);
        e.setSchedule(ps);
        e.setMethod(pm);
        PayrollDatabase.instance().addEmployee(itsEmpid, e);

    }
}
