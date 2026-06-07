public class Pirate extends Character {
    @Override protected void pickUpWeapon() {
        System.out.println("Pick up sword");
    }

    @Override
    protected void defenseAction() {
        System.out.println("Defend with sword");
    }

    @Override public void moveToSafety() {
        System.out.println("Return to the ship");
    }
}
