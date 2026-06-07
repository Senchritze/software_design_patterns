public class Saboteur extends Spy {
    public Saboteur(String name) {
        super(name);
    }

    @Override
    public void visit(GeneralStaff generalStaff) {
        int destroyedPapers = generalStaff.getSecretPaper();
        int neutralizedGenerals = generalStaff.getGenerals();

        generalStaff.setSecretPaper(0);
        generalStaff.setGenerals(0);

        System.out.println(getName() + " destroyed " + destroyedPapers
                + " secret papers and neutralized " + neutralizedGenerals + " generals in General Staff.");
    }

    @Override
    public void visit(MilitaryBase militaryBase) {
        int destroyedOfficers = militaryBase.getOfficers();
        int destroyedSoldiers = militaryBase.getSoldiers();
        int destroyedJeeps = militaryBase.getJeeps();
        int destroyedTanks = militaryBase.getTanks();

        militaryBase.setOfficers(0);
        militaryBase.setSoldiers(0);
        militaryBase.setJeeps(0);
        militaryBase.setTanks(0);

        System.out.println(getName() + " destroyed Military Base resources: officers="
                + destroyedOfficers + ", soldiers=" + destroyedSoldiers
                + ", jeeps=" + destroyedJeeps + ", tanks=" + destroyedTanks + ".");
    }
}
