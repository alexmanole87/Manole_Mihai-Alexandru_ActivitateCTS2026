public abstract class Raport {
    public final void genereazaRaport(){
        deschideRaport();
        adaugaContinut();
        inchideRaportul();
    }

    protected void deschideRaport(){
        System.out.println("Se deschide Raportul");
    }

    protected void inchideRaportul(){
        System.out.println("Se inchide Raportul");
    }
    public abstract void adaugaContinut();
}
