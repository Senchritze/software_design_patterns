public class SecretAgent extends Spy {
    public SecretAgent(String name) {
        super(name);
    }

    @Override
    public void visit(GeneralStaff generalStaff) {
        int stolenPapers = Math.min(15, generalStaff.getSecretPaper());
        generalStaff.setSecretPaper(generalStaff.getSecretPaper() - stolenPapers);

        System.out.println(getName() + " stole " + stolenPapers + " secret papers from General Staff.");
    }

    @Override
    public void visit(MilitaryBase militaryBase) {
        System.out.println(getName() + " collected information from Military Base: officers="
                + militaryBase.getOfficers()
                + ", soldiers=" + militaryBase.getSoldiers()
                + ", jeeps=" + militaryBase.getJeeps()
                + ", tanks=" + militaryBase.getTanks() + ".");
    }
}
