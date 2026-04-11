public class Utilizator implements Observer{

    private String nume;

    public Utilizator(String nume){
        this.nume = nume;
    }

    @Override
    public void uodate(double temperatura) {
        se
    }

    @Override
    public void uodate() {
        System.out.println("Utilizatorul " + nume + " a fostb notificat despre schimbarea temperaturii");
    }
}
