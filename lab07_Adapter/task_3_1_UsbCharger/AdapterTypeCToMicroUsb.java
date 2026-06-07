import com.mobile.Legacy.Charger;

public class AdapterTypeCToMicroUsb extends Charger {

    private static final float MICRO_USB_VOLTAGE = 5.0f;

    public AdapterTypeCToMicroUsb(TypeCCharger typeCCharger) {
        super(MICRO_USB_VOLTAGE, typeCCharger.getOutputPower() / MICRO_USB_VOLTAGE);
    }
}