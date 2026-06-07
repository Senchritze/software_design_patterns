public class DetailsVisitor implements EmployeeVisitor {
    private int managerCount;
    private int salesPersonCount;
    private int totalSalary;

    @Override
    public void visit(Manager manager) {
        managerCount++;
        totalSalary += manager.getSalary();
    }

    @Override
    public void visit(SalesPerson salesPerson) {
        salesPersonCount++;
        totalSalary += salesPerson.getSalary();
    }

    @Override
    public void visit(StaffList staffList) {
        for (Employee employee : staffList.getEmployees()) {
            employee.accept(this);
        }
    }

    public String getReport() {
        return "Staff report:" + System.lineSeparator()
                + "Managers: " + managerCount + System.lineSeparator()
                + "Sales persons: " + salesPersonCount + System.lineSeparator()
                + "Total salary: " + totalSalary;
    }
}
