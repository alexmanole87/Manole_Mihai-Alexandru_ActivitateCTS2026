public class Document implements Element {
    private String denumire;

    public Document(String denumire) {
        this.denumire = denumire;
    }

    @Override
    public void afiseaza(String identare) {
        System.out.println(identare + "-Document: " + denumire);
    }
}
