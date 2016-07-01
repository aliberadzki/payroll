package pl.aliberadzki.payroll;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by aliberadzki on 01.07.16.
 */
public class AddCommisionedEmployeeTest {
    @Test
    public void testAddCommisionedEmployee() throws Exception {
        int empid = 3;
        AddEmployeeTransaction t = AddCommisionedEmployee(empid, "Stefan", "Wieś", 2000, 0.15);

    }
}