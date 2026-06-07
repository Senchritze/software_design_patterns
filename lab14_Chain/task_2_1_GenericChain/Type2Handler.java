public class Type2Handler extends RequestHandler {
    @Override
    protected boolean canHandle(Request request) {
        return request.getType() == Request.Type.TYPE2;
    }

    @Override
    protected void process(Request request) {
      System.out.println("Type2: Handle request " + request);
      System.out.println("Type2: Open transaction");
      System.out.println("Type2: Update records");
    }
}
