abstract class OcupareMasaAbstract {

    abstract void curatareMasa();
    abstract void asezareServetele();
    abstract void asezareTacamuri();
    abstract void invitareClienti();
//    abstract void whatever();

    public final void ocupareMasa(){
        curatareMasa();
        asezareServetele();
        asezareTacamuri();
        invitareClienti();
//        whatever();
    }
}
