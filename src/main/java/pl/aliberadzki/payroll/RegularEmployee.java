package pl.aliberadzki.payroll;

/**
 * Created by aliberadzki on 01.07.16.
 */
public class RegularEmployee implements Employee {
    private String itsName;
    private String itsAddress;
    private int itsEmpid;

    private PaymentClassification itsPaymentClassification;
    private PaymentSchedule itsPaymentSchedule;
    private PaymentMethod itsPaymentMethod;
    private Affiliation itsAffiliation;

    public RegularEmployee(int empId, String name, String address) {
        this.itsAddress = address;
        this.itsName = name;
        this.itsEmpid = empId;
    }

    @Override
    public PaymentMethod getMethod() {
        return itsPaymentMethod;
    }

    @Override
    public PaymentSchedule getSchedule() {
        return itsPaymentSchedule;
    }

    @Override
    public PaymentClassification getClassification() {
        return itsPaymentClassification;
    }

    @Override
    public String getName() {
        return this.itsName;
    }

    @Override
    public void setClassification(PaymentClassification pc) {
        this.itsPaymentClassification = pc;
    }

    @Override
    public void setSchedule(PaymentSchedule ps) {
        this.itsPaymentSchedule = ps;
    }

    @Override
    public void setMethod(PaymentMethod pm) {
        this.itsPaymentMethod = pm;
    }

    @Override
    public void setAffiliation(Affiliation a) {
        this.itsAffiliation = a;
    }

    @Override
    public Affiliation getAffiliation() {
        return this.itsAffiliation;
    }

    @Override
    public String getAddress() {
        return itsAddress;
    }
}
