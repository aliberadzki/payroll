package pl.aliberadzki.payroll;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by aliberadzki on 02.07.16.
 */
public class DeleteEmployeeTransactionTest {
    @Test
    public void testDeleteEmployee() throws Exception {
        int empid = 3;
        Transaction t = new AddCommissionedEmployee(empid, "Lidia", "Dom", 2000, 0.1);
        t.execute();

        Employee e = PayrollDatabase.instance().getEmployee(empid);
        assertNotNull(e);

        t = new DeleteEmployeeTransaction(empid);
        t.execute();

        e = PayrollDatabase.instance().getEmployee(empid);
        assertNull(e);

    }
}