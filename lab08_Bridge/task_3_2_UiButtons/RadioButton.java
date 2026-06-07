public class RadioButton extends Button {
    public RadioButton(ButtonSize size) { super(size); }

    @Override
    public void draw() {
      System.out.println("Setting size to " + size.getSizeLabel() + "...");
      System.out.println("Drawing a radio button.\n");
    }
}