import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class EngineFlyweightFactory {
    private static final Map<String, Engine> CACHE = new ConcurrentHashMap<>();

    private EngineFlyweightFactory() {
    }

    public static Engine getEngine(int power, Engine.Fuel fuel) {
        String key = power + ":" + fuel;
        return CACHE.computeIfAbsent(key, k -> new Engine(power, fuel));
    }

    public static int getCachedObjectsCount() {
        return CACHE.size();
    }
}
