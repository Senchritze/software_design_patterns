public class Radio implements Device {
    private int volume;
    private int chanel;
    private boolean isOn;

    public Radio() {
        this.isOn = false;
        this.volume = 30;
        this.chanel = 88;
    }

    @Override
    public void on() {
        if (isOn) {
            System.out.println("Radio is already on");
            return;
        }
        isOn = true;
        System.out.println("Radio is on");
    }

    @Override public void off() {
        if (!isOn) {
            System.out.println("Radio is already off");
            return;
        }
        isOn = false;
        System.out.println("Radio is off");
    }

    @Override
    public void volumeUp() {
        if (!isOn) {
            System.out.println("Radio is off");
            return;
        }
        if (volume < 100) {
            volume++;
        }
        System.out.println("Radio volume = " + volume);
    }

    @Override
    public void volumeDown() {
        if (!isOn) {
            System.out.println("Radio is off");
            return;
        }
        if (volume > 0) {
            volume--;
        }
        System.out.println("Radio volume = " + volume);
    }

    @Override
    public void nextChanel() {
        if (!isOn) {
            System.out.println("Radio is off");
            return;
        }
        chanel = chanel == 108 ? 88 : chanel + 1;
        System.out.println("Radio station = " + chanel);
    }

    @Override
    public void prevChanel() {
        if (!isOn) {
            System.out.println("Radio is off");
            return;
        }
        chanel = chanel == 88 ? 108 : chanel - 1;
        System.out.println("Radio station = " + chanel);
    }
}
