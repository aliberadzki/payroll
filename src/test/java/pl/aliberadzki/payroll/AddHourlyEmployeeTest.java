package pl.aliberadzki.payroll;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by aliberadzki on 01.07.16.
 */
public class AddHourlyEmployeeTest {
    @Test
    public void testAddHourlyEmployee() throws Exception {
        int empid = 2;
        AddEmployeeTransaction t = new AddHourlyEmployee(empid, "Bogdan", "Mieszkanie", 70.0);
        t.execute();

        Employee e = PayrollDatabase.instance().getEmployee(empid);
        assertEquals("Bogdan", e.getName());
        assertEquals("Mieszkanie", e.getAddress());

        PaymentClassification pc = e.getClassification();
        HourlyClassification hc = (HourlyClassification)pc;
        assertNotNull(hc);

        assertEquals(70.0, hc.getRate(), 0.01);

        PaymentSchedule ps = e.getSchedule();
        HourlySchedule hs = (HourlySchedule) ps;
        assertNotNull(hs);

        PaymentMethod pm = e.getMethod();
        HoldMethod hm = (HoldMethod)pm;
        assertNotNull(hm);

    }
}