import java.util.ArrayList;
import java.util.List;

public class PlanesOnGround {
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

        StringBuilder builder = new StringBuilder();
        for (Plane plane : planes) {
            if (builder.length() > 0) {
                builder.append(", ");
            }
            builder.append(plane.getId());
        }
        return builder.toString();
    }
}
