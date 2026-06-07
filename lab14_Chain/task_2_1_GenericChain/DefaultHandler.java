public class DefaultHandler extends RequestHandler {
    @Override
    protected boolean canHandle(Request request) {
        return true;
    }

    @Override
    protected void process(Request request) {
        System.out.println("Unhandled request " + request);
    }
}
