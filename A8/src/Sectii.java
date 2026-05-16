public class Sectii implements Element {
    private String nume;

    public Sectii(String nume) {
        this.nume = nume;
    }

    @Override
    public void afiseaza(String indentare) {
        System.out.println(indentare + "Sectie: " + nume);
    }
}
