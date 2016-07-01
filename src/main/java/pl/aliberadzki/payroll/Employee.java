package pl.aliberadzki.payroll;

/**
 * Created by aliberadzki on 01.07.16.
 */
public interface Employee {
    PaymentMethod getMethod();

    PaymentSchedule getSchedule();

    PaymentClassification getClassification();

    String getName();

    void setClassification(PaymentClassification pc);

    void setSchedule(PaymentSchedule ps);

    void setMethod(PaymentMethod pm);

    String getAddress();
}
