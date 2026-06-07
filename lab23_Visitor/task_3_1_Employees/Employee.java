public interface Employee {
    int getSalary();

    void accept(EmployeeVisitor visitor);
}
