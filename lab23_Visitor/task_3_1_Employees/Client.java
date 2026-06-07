public class Client {
    public static void main(String[] args) {
        StaffList staffList = new StaffList();
        staffList.addEmployee(new Manager(60000));
        staffList.addEmployee(new SalesPerson(50000));
        staffList.addEmployee(new SalesPerson(40000));

        System.out.println("Total amount paid to staff: " + staffList.getSalary());

        DetailsVisitor visitor = new DetailsVisitor();
        staffList.accept(visitor);

        System.out.println();
        System.out.println(visitor.getReport());
    }
}
