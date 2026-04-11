public class Abonati implements Observer{

    private String nume;

    public Abonati (String numme){
        this.nume = numme;
    }

    @Override
    public void update(String stire) {
        System.out.println("Abonatul " + nume + " a primit "+ stire);
    }
}
