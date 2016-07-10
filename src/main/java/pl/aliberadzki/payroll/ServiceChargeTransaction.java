package pl.aliberadzki.payroll;

/**
 * Created by aliberadzki on 10.07.16.
 */
public class ServiceChargeTransaction implements Transaction {
    private int itsMemberId;
    private int itsDate;
    private double itsAmount;

    public ServiceChargeTransaction(int memberId, int date, double amount) {
        this.itsAmount = amount;
        this.itsDate = date;
        this.itsMemberId = memberId;
    }

    @Override
    public void execute() throws Exception {
        Employee e = PayrollDatabase.instance().getUnionMember(this.itsMemberId);
        Affiliation a = e.getAffiliation();

        if(a instanceof UnionAffiliation) {
            UnionAffiliation uaf = (UnionAffiliation) a;
            uaf.addServiceCharge(itsDate, itsAmount);
        }
    }
}
