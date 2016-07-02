package pl.aliberadzki.payroll;

/**
 * Created by aliberadzki on 02.07.16.
 */
public class DeleteEmployeeTransaction implements Transaction {
    private int empid;

    public DeleteEmployeeTransaction(int empid) {
        this.empid = empid;
    }

    @Override
    public void execute() {
        PayrollDatabase.instance().deleteEmployee(empid);
    }
}
