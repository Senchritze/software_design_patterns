public class Type3Handler extends RequestHandler {
    @Override
    protected boolean canHandle(Request request) {
        return request.getType() == Request.Type.TYPE3;
    }

    @Override
    protected void process(Request request) {
        System.out.println("Type3: Handle request " + request);
        System.out.println("Type3: Verify permissions");
        System.out.println("Type3: Send notification");
    }
}
