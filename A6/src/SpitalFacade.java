public class SpitalFacade {
    private Pacient pacient;
    private Medic medic;
    private Salon salon;

    public SpitalFacade() {
        this.pacient = new Pacient();
        this.medic = new Medic();
        this.salon = new Salon();
    }



    public void verificareInternare(){
        pacient.verificaGravitateaStarii();
        medic.verificaConfirmareMedic();
        salon.verifcaDisponibilitatePat();
    }
}
