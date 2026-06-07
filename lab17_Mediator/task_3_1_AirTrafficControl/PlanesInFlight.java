import java.util.ArrayList;
import java.util.List;

public class PlanesInFlight {
    private final List<Plane> planes = new ArrayList<>();

    public void addPlane(Plane plane) {
        if (!planes.contains(plane)) {
            planes.add(plane);
        }
    }

    public void removePlane(Plane plane) {
        planes.remove(plane);
    }

    @Override
    public String toString() {
        if (planes.isEmpty()) {
            return "none";
        }

        StringBuilder text = new StringBuilder();
        for (int i = 0; i < planes.size(); i++) {
            text.append(planes.get(i).getId());
            if (i < planes.size() - 1) {
                text.append(", ");
            }
        }
        return text.toString();
    }
}
