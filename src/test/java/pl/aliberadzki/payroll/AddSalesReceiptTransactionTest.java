package pl.aliberadzki.payroll;

import org.junit.Test;


import static org.junit.Assert.*;

/**
 * Created by aliberadzki on 09.07.16.
 */
public class AddSalesReceiptTransactionTest {

    @Test
    public void testAddSalesReceipt() throws Exception {
        int empid = 1;
        Transaction et = new AddCommissionedEmployee(empid, "Patryk", "adresik", 1000.0, 0.4);
        et.execute();

        Transaction t = new AddSalesReceiptTransaction(empid, 20160710, 10000);
        t.execute();

        Employee e = PayrollDatabase.instance().getEmployee(empid);
        assertNotNull(e);

        PaymentClassification pc = e.getClassification();
        CommissionedClassification cc = (CommissionedClassification) pc;
        assertNotNull(cc);

        SalesReceipt sr = cc.getSalesReceipt(20160710);

    }
}