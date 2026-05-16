public class MedicamentSpitalAdaptor implements MedicamentFarmacie {
    private MedicamentSpital medicamentSpital;

    public MedicamentSpitalAdaptor(MedicamentSpital medicamentSpital) {
        this.medicamentSpital = medicamentSpital;
    }

    @Override
    public void cumparaMedicament() {
        medicamentSpital.achizitioneazaMedicament();
    }
}
