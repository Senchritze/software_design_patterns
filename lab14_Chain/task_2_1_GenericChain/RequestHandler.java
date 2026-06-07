public abstract class RequestHandler {
    private RequestHandler next;

    public RequestHandler setNext(RequestHandler next) {
        this.next = next;
        return next;
    }

    public void handle(Request request) {
        if (canHandle(request)) {
            process(request);
            return;
        }

        if (next != null) {
            next.handle(request);
            return;
        }

        System.out.println("Unhandled request " + request);
    }

    protected abstract boolean canHandle(Request request);

    protected abstract void process(Request request);
}
