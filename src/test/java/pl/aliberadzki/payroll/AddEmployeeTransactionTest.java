package pl.aliberadzki.payroll;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.max.MaxCore;

import static org.junit.Assert.*;

/**
 * Created by aliberadzki on 01.07.16.
 */
public class AddEmployeeTransactionTest {
    private PayrollDatabase payrollDatabase = PayrollDatabase.instance();
    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void testGetClassification() throws Exception {

    }

    @Test
    public void testGetSchedule() throws Exception {

    }

    @Test
    public void testExecute() throws Exception {

    }

    @Test
    public void testAddSalariedEmployee() throws Exception {
        int empid = 1;
        AddEmployeeTransaction t = new AddSalariedEmployee(empid, "Bogdan", "Dom", 2500.0);

        t.execute();

        Employee e = payrollDatabase.getEmployee(empid);
        assertEquals("Bogdan", e.getName());
        assertEquals("Dom", e.getAddress());

        PaymentClassification pc = e.getClassification();
        SalariedClassification sc = (SalariedClassification) pc;

        assertNotNull(sc);
        assertEquals(2500.00, sc.getSalary(), 0.001);

        PaymentSchedule ps = e.getSchedule();
        MonthlySchedule ms = (MonthlySchedule) ps;
        assertNotNull(ms);

        PaymentMethod pm = e.getMethod();
        HoldMethod hm = (HoldMethod) pm;
        assertNotNull(hm);

    }
}