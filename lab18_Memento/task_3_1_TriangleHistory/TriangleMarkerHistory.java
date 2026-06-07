import java.util.ArrayList;
import java.util.List;

public class TriangleMarkerHistory {
    private final List<TriangleMarkerMemento> snapshots = new ArrayList<>();
    private final List<Float> areas = new ArrayList<>();

    public void add(TriangleMarker triangle) {
        snapshots.add(triangle.save());
        areas.add(triangle.square());
    }

    public TriangleMarkerMemento getLargestSquareMemento() {
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
