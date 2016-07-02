package pl.aliberadzki.payroll;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by aliberadzki on 02.07.16.
 */
public class AddTimeCardTest {

    @Test
    public void testAddTimeCardTransaction() throws Exception {
        int empId = 2;

        Transaction t = new AddHourlyEmployee(empId, "Jan", "Dom", 50);
        t.execute();


        Transaction tct = new AddTimeCard(20160702, 8.0, empId);
        tct.execute();

        Employee e = PayrollDatabase.instance().getEmployee(empId);
        assertNotNull(e);

        PaymentClassification pc = e.getClassification();
        HourlyClassification hc = (HourlyClassification) pc;
        assertNotNull(hc);

        TimeCard tc = hc.getTimeCard(20160702);
        assertNotNull(tc);
        assertEquals(8.0, tc.getHours(), 0.001);

    }
}