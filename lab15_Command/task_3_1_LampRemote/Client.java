import java.util.Arrays;

public class Client {
    public static void main(String[] args) {
        Lamp kitchenLamp = new Lamp("Kitchen");
        Lamp hallLamp = new Lamp("Hall");
        Lamp bedroomLamp = new Lamp("Bedroom");
        Lamp bathroomLamp = new Lamp("Bathroom");

        Controller controllerKitchenLamp = new Controller();
        Controller controllerHallLamp = new Controller();
        Controller controllerBedroomLamp = new Controller();
        Controller controllerBathroomLamp = new Controller();
        Controller controllerUniversal = new Controller();

        controllerKitchenLamp.setOnCommand(new LampOnCommand(kitchenLamp));
        controllerKitchenLamp.setOffCommand(new LampOffCommand(kitchenLamp));

        controllerHallLamp.setOnCommand(new LampOnCommand(hallLamp));
        controllerHallLamp.setOffCommand(new LampOffCommand(hallLamp));

        controllerBedroomLamp.setOnCommand(new LampOnCommand(bedroomLamp));
        controllerBedroomLamp.setOffCommand(new LampOffCommand(bedroomLamp));

        controllerBathroomLamp.setOnCommand(new LampOnCommand(bathroomLamp));
        controllerBathroomLamp.setOffCommand(new LampOffCommand(bathroomLamp));

        controllerUniversal.setOffCommand(new UniversalOffCommand(
                Arrays.asList(kitchenLamp, hallLamp, bedroomLamp, bathroomLamp)
        ));

        controllerKitchenLamp.on();
        controllerHallLamp.on();
        controllerBedroomLamp.on();
        controllerKitchenLamp.off();
        controllerHallLamp.off();
        controllerBedroomLamp.off();
        controllerBedroomLamp.on();
        controllerBathroomLamp.on();
        controllerUniversal.off();
    }
}
