package pl.aliberadzki.payroll;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by aliberadzki on 01.07.16.
 */
public class HourlyClassification implements PaymentClassification {
    private double itsRate;
    private Map<Integer, TimeCard> itsTimeCards;

    public HourlyClassification(double itsRate) {
        this.itsRate = itsRate;
        this.itsTimeCards = new HashMap<Integer, TimeCard>();
    }

    public double getRate() {
        return this.itsRate;
    }

    public void setRate(double rate) {
        this.itsRate = itsRate;
    }

    public TimeCard getTimeCard(int date) {
        return itsTimeCards.get(date);
    }

    public void addTimeCard(TimeCard timeCard) {
        itsTimeCards.put(timeCard.getDate(), timeCard);
    }
}
