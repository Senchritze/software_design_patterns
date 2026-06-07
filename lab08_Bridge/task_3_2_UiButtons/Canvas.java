public class Canvas {
    public static void main(String[] args) {

        Button checkbox = new CheckboxButton(new SmallSize());
        checkbox.draw();

        Button radio = new RadioButton(new MediumSize());
        radio.draw();

        Button dropdown = new DropdownButton(new LargeSize());
        dropdown.draw();

        Button imageBtn = new ImageButton(new MediumSize(), "icons/save.png");
        imageBtn.draw();

        Button customCheckbox = new CheckboxButton(new UserSize(48));
        customCheckbox.draw();

        Button customImage = new ImageButton(new UserSize(64), "icons/upload.png");
        customImage.draw();
    }
}