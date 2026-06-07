public class Type4Handler extends RequestHandler {
    @Override
    protected boolean canHandle(Request request) {
        return request.getType() == Request.Type.TYPE4;
    }

    @Override
    protected void process(Request request) {
        System.out.println("Type4: Handle request " + request);
        System.out.println("Type4: Prepare report");
        System.out.println("Type4: Archive result");
    }
}
