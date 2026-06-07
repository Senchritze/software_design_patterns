import java.util.ArrayList;
import java.util.List;

public class TriangleHistory {
    private final List<Triangle.Memento> snapshots = new ArrayList<>();
    private final List<Float> areas = new ArrayList<>();

    public void add(Triangle triangle) {
        snapshots.add(triangle.save());
        areas.add(triangle.square());
    }

    public Triangle.Memento getLargestSquareMemento() {
        if (snapshots.isEmpty()) {
            throw new IllegalStateException("History is empty");
        }

        int maxIndex = 0;
        for (int i = 1; i < areas.size(); i++) {
            if (areas.get(i) > areas.get(maxIndex)) {
                maxIndex = i;
            }
        }
        return snapshots.get(maxIndex);
    }
}
