import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class WheelFlyweightFactory {
    private static final Map<String, Wheel> CACHE = new ConcurrentHashMap<>();

    private WheelFlyweightFactory() {
    }

    public static Wheel getWheel(int diameter) {
        return getWheel(Wheel.Material.Steel, diameter);
    }

    public static Wheel getWheel(Wheel.Material material, int diameter) {
        String key = material + ":" + diameter;
        return CACHE.computeIfAbsent(key, k -> new Wheel(material, diameter));
    }

    public static int getCachedObjectsCount() {
        return CACHE.size();
    }
}
