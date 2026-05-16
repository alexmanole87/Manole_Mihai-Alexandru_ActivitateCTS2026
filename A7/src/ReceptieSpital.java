public class ReceptieSpital {
    private ModalitateTransmitereRezultat modalitateTransmitereRezultat;

    public ReceptieSpital(ModalitateTransmitereRezultat modalitateTransmitereRezultat) {
        this.modalitateTransmitereRezultat = modalitateTransmitereRezultat;
    }

    public void setModalitateTransmitereRezultat(ModalitateTransmitereRezultat modalitateTransmitereRezultat) {
        this.modalitateTransmitereRezultat = modalitateTransmitereRezultat;
    }

    public void trasmitereRezultat(){
        modalitateTransmitereRezultat.trimiteRezultat();
    }
}
