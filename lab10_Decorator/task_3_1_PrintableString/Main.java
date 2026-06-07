public class Main {
    public static void main(String[] args) {
        PrintableString printableString = new PostEndlDecorator(
            new PostExclaimDecorator(
                new PostWordDecorator(
                    new PostSpaceDecorator(
                        new PostComaDecorator(
                            new PreWordDecorator(
                                new PrintableString(""),
                                "Hello"
                            )
                        )
                    ),
                    "World"
                )
            )
        );

        printableString.print();
    }
}
