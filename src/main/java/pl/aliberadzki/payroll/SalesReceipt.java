package pl.aliberadzki.payroll;

/**
 * Created by aliberadzki on 10.07.16.
 */
public class SalesReceipt {
    private Integer date;
    private double salesAmount;

    public SalesReceipt(Integer date, double salesAmount) {
        this.date = date;
        this.salesAmount = salesAmount;
    }

    public Integer getDate() {
        return date;
    }
}
