// Client — будує ієрархію супермаркету й нараховує зарплату всім ОДНИМ
// викликом payExpenses() на кореневому елементі (патерн Composite).
public class ExpensesClient {
    public static void main(String[] args) {
        // Директор супермаркету (окремий працівник-листок)
        Manager director = new Manager("Jane (director)", 1000);

        // Супермаркет = контейнер, що містить директора і три відділи
        Department supermarket = new Department("Supermarket");
        supermarket.add(director);
        supermarket.add(buildDepartment("Meat department", "Bob"));
        supermarket.add(buildDepartment("Dairy department", "Sue"));
        supermarket.add(buildDepartment("Confectionery department", "Tom"));

        // Один виклик нараховує зарплату всій структурі
        supermarket.payExpenses();
    }

    // Відділ: менеджер + принаймні три продавці
    private static Department buildDepartment(String departmentName, String managerName) {
        Manager manager = new Manager(managerName, 600);
        Department department = new Department(departmentName);
        department.add(manager);
        department.add(new Salesperson(managerName + "'s seller #1", 300, manager));
        department.add(new Salesperson(managerName + "'s seller #2", 320, manager));
        department.add(new Salesperson(managerName + "'s seller #3", 310, manager));
        return department;
    }
}
