package pl.aliberadzki.payroll;

/**
 * Created by aliberadzki on 02.07.16.
 */
public class CommissionedClassification implements PaymentClassification {

    private double itsSalary;
    private double itsRate;

    public CommissionedClassification(double itsSalary, double itsRate) {
        this.itsRate = itsRate;
        this.itsSalary = itsSalary;
    }

    public double getSalary() {
        return itsSalary;
    }

    public double getRate() {
        return itsRate;
    }
}
