import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        final List<MilitaryObject> militaryObjects = new ArrayList<>();
        militaryObjects.add(new GeneralStaff(20, 100));
        militaryObjects.add(new MilitaryBase(10, 1000, 300, 20));

        final List<Spy> spies = new ArrayList<>();
        spies.add(new SecretAgent("Agent Smith"));
        spies.add(new Saboteur("Shadow"));

        printState("Initial state", militaryObjects);

        for (Spy spy : spies) {
            System.out.println("--- " + spy.getName() + " starts mission ---");
            for (MilitaryObject militaryObject : militaryObjects) {
                militaryObject.accept(spy);
            }
            printState("State after " + spy.getClass().getSimpleName(), militaryObjects);
        }
    }

    private static void printState(String title, List<MilitaryObject> militaryObjects) {
        System.out.println();
        System.out.println(title + ":");
        for (MilitaryObject militaryObject : militaryObjects) {
            System.out.println(militaryObject);
        }
    }
}
