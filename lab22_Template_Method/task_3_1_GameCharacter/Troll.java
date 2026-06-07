public class Troll extends Character {

    @Override
    protected void pickUpWeapon() {
        System.out.println("Pick up club");
    }

    @Override
    protected void defenseAction() {
        System.out.println("Defend with club");
    }

    @Override
    protected void moveToSafety() {
        System.out.println("Return to the mountain");
    }
}
