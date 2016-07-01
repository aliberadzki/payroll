package pl.aliberadzki.payroll;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by aliberadzki on 01.07.16.
 */
public class PayrollDatabase {

    private static PayrollDatabase instance = null;
    private Map<Integer, Employee> itsEmployees;

    private PayrollDatabase() {
        this.itsEmployees = new HashMap<Integer, Employee>();
    }

    public static PayrollDatabase instance() {
        if(instance == null) {
            instance = new PayrollDatabase();
        }
        return instance;
    }

    public void addEmployee(int empId, Employee employee){
        itsEmployees.put(empId, employee);
    }

    public Employee getEmployee(int empId) {
        return itsEmployees.get(empId);
    }

    public void clear() {
        itsEmployees.clear();
    }
}
