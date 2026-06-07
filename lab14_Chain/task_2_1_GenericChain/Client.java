public class Client {
    public static void main(String[] args) {
        Request[] requests = {
                new Request(Request.Type.TYPE1),
                new Request(Request.Type.TYPE2),
                new Request(Request.Type.TYPE1),
                new Request(Request.Type.TYPE3),
                new Request(Request.Type.TYPE4),
                new Request(Request.Type.TYPE2),
                new Request(Request.Type.TYPE4),
                new Request(Request.Type.TYPE1)
        };

        RequestHandler chain = new Type1Handler();
        chain.setNext(new Type2Handler())
                .setNext(new Type3Handler())
                .setNext(new Type4Handler())
                .setNext(new DefaultHandler());

        for (Request request : requests) {
            chain.handle(request);
            System.out.println();
        }
    }
}
