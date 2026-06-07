import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class StaffListIterator implements Iterator<Employee> {
    private final List<Employee> employees;
    private int currentIndex;

    public StaffListIterator(List<Employee> source) {
        this.employees = new ArrayList<>(source);
        this.employees.sort(Comparator.comparing(Employee::getName, String.CASE_INSENSITIVE_ORDER));
        this.currentIndex = 0;
    }

    @Override
    public boolean hasNext() {
      return currentIndex < employees.size();
    }

    @Override
    public Employee next() {
        if (!hasNext()) {
            throw new NoSuchElementException("No more employees");
        }

        Employee employee = employees.get(currentIndex);
        currentIndex++;
        return employee;
    }
}
