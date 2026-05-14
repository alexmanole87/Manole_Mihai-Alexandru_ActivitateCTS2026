public class Avocat implements Observer{
    private String nume;

    public Avocat(String nume) {
        this.nume = nume;
    }

    @Override
    public void primesteMesaj(String mesaj) {
        System.out.println("Avocatul " + nume  + " a primit urmatoarea notificare " + mesaj);
    }
}
