package pl.aliberadzki.payroll;

/**
 * Created by aliberadzki on 02.07.16.
 */
public class TimeCard {
    private double itsHours;
    private Integer itsDate;

    public TimeCard(int date, double hours) {
        this.itsHours = hours;
        this.itsDate = date;
    }

    public double getHours() {
        return itsHours;
    }

    public Integer getDate() {
        return itsDate;
    }
}
