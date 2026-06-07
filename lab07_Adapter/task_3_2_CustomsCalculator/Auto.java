public class Auto {
    private final String model;
    private final int age; // years
    private final boolean damaged;
    private final int mileage; // km

    public Auto(String model, int age, boolean damaged, int mileage) {
        this.model = model;
        this.age = age;
        this.damaged = damaged;
        this.mileage = mileage;
    }

    public String getModel() { return model; }
    public int getAge() { return age; }
    public boolean isDamaged() { return damaged; }
    public int getMileage() { return mileage; }

    @Override
    public String toString() {
        return "Auto{model='" + model + "', age=" + age
                + ", damaged=" + damaged + ", mileage=" + mileage + "}";
    }
}