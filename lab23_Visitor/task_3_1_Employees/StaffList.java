import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StaffList implements Employee {
    private final ArrayList<Employee> employees = new ArrayList<>();

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public List<Employee> getEmployees() {
        return Collections.unmodifiableList(employees);
    }

    @Override
    public int getSalary() {
        SalaryVisitor salaryVisitor = new SalaryVisitor();
        accept(salaryVisitor);
        return salaryVisitor.getTotalSalary();
    }

    @Override
    public void accept(EmployeeVisitor visitor) {
        visitor.visit(this);
    }
}
