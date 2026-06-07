public class Main {
    public static void main(String[] args) {
        CustomStringBuilder builder = new CustomStringBuilder();

        System.out.println("StringBuilder — Builder Pattern");
        System.out.println("--------------------------------\n");

        StringProduct result1 = builder
                .append("Hello")
                .append(", ")
                .append("World")
                .append("!")
                .build();
        System.out.println("append chain:");
        System.out.println("  Result: \"" + result1 + "\"");
        System.out.println("  Length: " + result1.length());

        builder.reset();
        builder.append("Hello World!");
        System.out.println("\ninsert:");
        System.out.println("  Before: \"" + builder.peek() + "\"");
        builder.insert(5, ", beautiful");
        StringProduct result2 = builder.build();
        System.out.println("  After insert at 5: \"" + result2 + "\"");

        builder.reset();
        builder.append("World!"); builder.prepend("Hello, ");
        StringProduct result3 = builder.build();
        System.out.println("\nprepend:");
        System.out.println("  Result: \"" + result3 + "\"");

        // appendLine
        builder.reset();
        StringProduct result4 = builder
                .appendLine("Line 1: Design Patterns")
                .appendLine("Line 2: Builder Pattern")
                .appendLine("Line 3: Done!")
                .build();
        System.out.println("appendLine:");
        System.out.print(result4);

        builder.reset();
        builder.append("The  is hot");
        System.out.println("complex insert:");
        System.out.println("  Before: \"" + builder.peek() + "\"");
        builder.insert(4, "coffee");
        StringProduct result5 = builder.build();
        System.out.println("  After:  \"" + result5 + "\"");
    }
}