public class Television implements Device {
    private int volume;
    private int chanel;
    private boolean isOn;

    public Television() {
        this.isOn = false;
        this.volume = 50;
        this.chanel = 1;
    }

    @Override
    public void on() {
        if (isOn) {
            System.out.println("Television is already on");
            return;
        }
        isOn = true;
        System.out.println("Television is on");
    }

    @Override
    public void off() {
        if (!isOn) {
            System.out.println("Television is already off");
            return;
        }
        isOn = false;
        System.out.println("Television is off");
    }

    @Override
    public void volumeUp() {
        if (!isOn) {
            System.out.println("Television is off");
            return;
        }
        if (volume < 100) {
            volume++;
        }
        System.out.println("Television volume = " + volume);
    }

    @Override
    public void volumeDown() {
        if (!isOn) {
            System.out.println("Television is off");
            return;
        }
        if (volume > 0) {
            volume--;
        }
        System.out.println("Television volume = " + volume);
    }

    @Override
    public void nextChanel() {
        if (!isOn) {
            System.out.println("Television is off");
            return;
        }
        chanel = chanel == 99 ? 1 : chanel + 1;
        System.out.println("Television channel = " + chanel);
    }

    @Override
    public void prevChanel() {
        if (!isOn) {
            System.out.println("Television is off");
            return;
        }
        chanel = chanel == 1 ? 99 : chanel - 1;
        System.out.println("Television channel = " + chanel);
    }
}
