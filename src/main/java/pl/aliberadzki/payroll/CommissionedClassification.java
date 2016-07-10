package pl.aliberadzki.payroll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by aliberadzki on 02.07.16.
 */
public class CommissionedClassification implements PaymentClassification {

    private double itsSalary;
    private double itsRate;
    private Map<Integer,SalesReceipt> itsSalesReceipts;

    public CommissionedClassification(double itsSalary, double itsRate) {
        this.itsRate = itsRate;
        this.itsSalary = itsSalary;
        this.itsSalesReceipts = new HashMap<Integer, SalesReceipt>();
    }

    public double getSalary() {
        return itsSalary;
    }

    public double getRate() {
        return itsRate;
    }

    public SalesReceipt getSalesReceipt(int date) {
        return this.itsSalesReceipts.get(date);
    }

    public void addSalesReceipt(SalesReceipt sr) {
        this.itsSalesReceipts.put(sr.getDate(), sr);
    }
}
