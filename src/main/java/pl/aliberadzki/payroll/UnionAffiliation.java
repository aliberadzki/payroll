package pl.aliberadzki.payroll;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by aliberadzki on 10.07.16.
 */
public class UnionAffiliation implements Affiliation {
    private Map<Integer, ServiceCharge> itsServiceCharges;

    public UnionAffiliation(int payment) {
        this.itsServiceCharges = new HashMap<Integer, ServiceCharge>();
    }

    public ServiceCharge getServiceCharge(int date) {
        return this.itsServiceCharges.get(date);
    }

    public void addServiceCharge(int date, double amount) {
        ServiceCharge sc = new ServiceCharge(date, amount);
        this.itsServiceCharges.put(date, sc);
    }
}
