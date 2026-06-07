public class Type1Handler extends RequestHandler {
    @Override
    protected boolean canHandle(Request request) {
        return request.getType() == Request.Type.TYPE1;
    }

    @Override public void process(Request request) {
        System.out.println("Type1: Handle request " + request);
        System.out.println("Type1: Check request data");
        System.out.println("Type1: Build response");
    }
}
