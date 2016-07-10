package pl.aliberadzki.payroll;

/**
 * Created by aliberadzki on 10.07.16.
 */
public class ServiceCharge {
    private double amount;
    private int date;

    public ServiceCharge(int date, double amount) {
        this.amount = amount;
        this.date = date;
    }

    public double getAmount() {
        return amount;
    }
}
