public class Book implements Readable {
    protected String name;
    protected boolean checkedOut;

    public Book(String name, boolean checkedOut) {
        this.name = name;
        this.checkedOut = checkedOut;
    }

    @Override
    public void checkout() {
        if (!checkedOut) {
            System.out.println("Checking out " + name);
            checkedOut = true;
        } else {
            System.out.println(name + " is already checked out");
        }
    }

    @Override
    public void returnBook() {
        if (checkedOut) {
            System.out.println("Returning " + name);
            checkedOut = false;
        } else {
            System.out.println(name + " is not checked out");
        }
    }
}
