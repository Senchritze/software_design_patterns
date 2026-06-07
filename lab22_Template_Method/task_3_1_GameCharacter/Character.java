public abstract class Character {
    public final void defendAgainstAttack() {
        pickUpWeapon();
        defenseAction();
        moveToSafety();
        System.out.println();
    }

    protected abstract void pickUpWeapon();

    protected abstract void defenseAction();

    protected abstract void moveToSafety();
}
