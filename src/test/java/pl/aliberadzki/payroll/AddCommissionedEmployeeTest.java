package pl.aliberadzki.payroll;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by aliberadzki on 01.07.16.
 */
public class AddCommissionedEmployeeTest {
    @Test
    public void testAddCommissionedEmployee() throws Exception {
        int empid = 3;
        AddEmployeeTransaction t = new AddCommissionedEmployee(empid, "Stefan", "Wieś", 2000, 0.15);
        t.execute();

        Employee e = PayrollDatabase.instance().getEmployee(empid);
        assertEquals("Stefan", e.getName());
        assertEquals("Wieś", e.getAddress());

        PaymentClassification pc = e.getClassification();
        CommissionedClassification cc = (CommissionedClassification)pc;
        assertNotNull(cc);

        assertEquals(2000, cc.getSalary(), 0.01);
        assertEquals(0.15, cc.getRate(), 0.01);

        PaymentSchedule ps = e.getSchedule();
        BiweeklySchedule bs = (BiweeklySchedule) ps;
        assertNotNull(bs);

        PaymentMethod pm = e.getMethod();
        HoldMethod hm = (HoldMethod)pm;
        assertNotNull(hm);

    }
}