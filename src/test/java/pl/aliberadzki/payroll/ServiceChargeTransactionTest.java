package pl.aliberadzki.payroll;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by aliberadzki on 10.07.16.
 */
public class ServiceChargeTransactionTest {

    @Test
    public void testServiceCharge() throws Exception {
        int empid = 1;
        Transaction t = new AddHourlyEmployee(empid, "Janusz", "Gostynin", 50);
        t.execute();

        Employee e = PayrollDatabase.instance().getEmployee(empid);
        assertNotNull(e);

        UnionAffiliation ua = new UnionAffiliation(20);
        e.setAffiliation(ua);

        int memberId = 86;
        PayrollDatabase.instance().addUnionMember(memberId, e);

        t = new ServiceChargeTransaction(memberId, 20160710, 12.95);
        t.execute();

        ServiceCharge sc = ua.getServiceCharge(20160710);
        assertNotNull(sc);
        assertEquals(12.95, sc.getAmount(), 0.001);

    }
}