public class CheckboxButton extends Button {
    public CheckboxButton(ButtonSize size) { super(size); }

    @Override
    public void draw() {
        System.out.println("Setting size to " + size.getSizeLabel() + "...");
        System.out.println("Drawing a checkbox button.\n");
    }
}