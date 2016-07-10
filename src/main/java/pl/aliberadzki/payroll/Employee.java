package pl.aliberadzki.payroll;

/**
 * Created by aliberadzki on 01.07.16.
 */
public interface Employee {

    PaymentClassification getClassification();

    PaymentSchedule getSchedule();

    PaymentMethod getMethod();

    String getName();

    String getAddress();

    void setClassification(PaymentClassification pc);

    void setSchedule(PaymentSchedule ps);

    void setMethod(PaymentMethod pm);

    void setAffiliation(Affiliation ua);

    Affiliation getAffiliation();

}
