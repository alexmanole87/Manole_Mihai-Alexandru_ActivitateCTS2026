public class RezervareProxy implements Rezervare{

    private RezervareRestaurant rezv;

    public RezervareProxy(){
        this.rezv = new RezervareRestaurant();
    }

    @Override
    public void creeazaRezervare(int nrPers) {
        if (nrPers>3){
            rezv.creeazaRezervare(nrPers);
        } else {
            System.out.println("Rezervarea nu poate fi realizata pentru mai putin de 4 persoane.");
            System.out.println("Va rugam sa va prezentati direct la restaurant. Exista suficiente mese pentru 2 persoane.");
        }
    }
}
