// Leaf — продавець (окремий працівник), підпорядкований менеджеру.
public class Salesperson implements Employee {
    private final String name;
    private final int salary;
    private final Manager manager;

    public Salesperson(String name, int salary, Manager manager) {
        this.name = name;
        this.salary = salary;
        this.manager = manager;
    }

    public Manager getManager() {
        return manager;
    }

    @Override
    public void payExpenses() {
        System.out.println(name + " (salesperson) has been paid $" + salary);
    }
}
