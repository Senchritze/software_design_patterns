import java.util.ArrayList;
import java.util.List;

// Composite — відділ. Сам є Employee і містить інших Employee
// (менеджерів, продавців або вкладені відділи). payExpenses() делегує
// нарахування всім дочірнім елементам.
public class Department implements Employee {
    private final String name;
    private final List<Employee> members = new ArrayList<>();

    public Department(String name) {
        this.name = name;
    }

    public Department add(Employee employee) {
        members.add(employee);
        return this;
    }

    public void remove(Employee employee) {
        members.remove(employee);
    }

    public List<Employee> getMembers() {
        return members;
    }

    @Override
    public void payExpenses() {
        System.out.println("== " + name + " ==");
        for (Employee member : members) {
            member.payExpenses();
        }
    }
}
