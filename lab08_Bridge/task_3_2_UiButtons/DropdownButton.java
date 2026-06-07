public class DropdownButton extends Button {
    public DropdownButton(ButtonSize size) { super(size); }

    @Override
    public void draw() {
        System.out.println("Setting size to " + size.getSizeLabel() + "...");
        System.out.println("Drawing a dropdown button.\n");
    }
}