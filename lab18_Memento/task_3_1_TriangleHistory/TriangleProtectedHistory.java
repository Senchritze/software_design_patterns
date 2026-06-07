import java.util.ArrayList;
import java.util.List;

public class TriangleProtectedHistory {
    private final List<TriangleProtected.SnapshotView> snapshots = new ArrayList<>();

    public void add(TriangleProtected triangle) {
        snapshots.add(triangle.save());
    }

    public TriangleProtected.SnapshotView getLargestSquareMemento() {
        if (snapshots.isEmpty()) {
            throw new IllegalStateException("History is empty");
        }

        TriangleProtected.SnapshotView best = snapshots.get(0);
        for (int i = 1; i < snapshots.size(); i++) {
            if (snapshots.get(i).getSquare() > best.getSquare()) {
                best = snapshots.get(i);
            }
        }
        return best;
    }
}
