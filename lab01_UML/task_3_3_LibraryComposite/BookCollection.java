import java.util.ArrayList;
import java.util.List;

public class BookCollection implements Readable {
    private final List<Readable> children = new ArrayList<>();

    public List<Readable> getChildren() {
        return children;
    }

    public void add(Readable readable) {
        children.add(readable);
    }

    public void remove(Readable readable) {
        children.remove(readable);
    }

    @Override
    public void checkout() {
        for (Readable child : children) {
            child.checkout();
        }
    }

    @Override
    public void returnBook() {
        for (Readable child : children) {
            child.returnBook();
        }
    }
}
