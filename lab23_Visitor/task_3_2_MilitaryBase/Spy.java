public abstract class Spy {
    private final String name;

    protected Spy(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void visit(GeneralStaff generalStaff);

    public abstract void visit(MilitaryBase militaryBase);
}
