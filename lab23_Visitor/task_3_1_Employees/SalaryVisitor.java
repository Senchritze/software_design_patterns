public class SalaryVisitor implements EmployeeVisitor {
    private int totalSalary;

    @Override
    public void visit(Manager manager) {
        totalSalary += manager.getSalary();
    }

    @Override
    public void visit(SalesPerson salesPerson) {
        totalSalary += salesPerson.getSalary();
    }

    @Override
    public void visit(StaffList staffList) {
        for (Employee employee : staffList.getEmployees()) {
            employee.accept(this);
        }
    }

    public int getTotalSalary() {
        return totalSalary;
    }
}
