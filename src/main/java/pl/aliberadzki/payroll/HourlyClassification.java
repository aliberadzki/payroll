package pl.aliberadzki.payroll;

/**
 * Created by aliberadzki on 01.07.16.
 */
public class HourlyClassification implements PaymentClassification {
    private double itsRate;

    public HourlyClassification(double itsRate) {
        this.itsRate = itsRate;
    }

    public double getRate() {
        return this.itsRate;
    }

    public void setRate(double rate) {
        this.itsRate = itsRate;
    }
}
