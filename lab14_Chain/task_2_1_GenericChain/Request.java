import java.util.concurrent.ThreadLocalRandom;

public class Request {
    public enum Type {
        TYPE1,
        TYPE2,
        TYPE3,
        TYPE4
    }

    private final Type type;
    private final int id;

    public Request(Type type) {
        this.type = type;
        this.id = ThreadLocalRandom.current().nextInt(1, 1_000_000);
    }

    public Type getType() {
        return type;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Request{" +
                "type=" + type +
                ", id=" + id +
                '}';
    }
}
