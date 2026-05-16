import java.util.ArrayList;
import java.util.List;

public class Departament implements Element {
    private String denumire;
    private List<Element> elemente = new ArrayList<>();

    public Departament(String denumire) {
        this.denumire = denumire;
    }

    public void adaugaElement(Element element) {
        elemente.add(element);
    }

    public void stergeElement(Element element) {
        elemente.remove(element);
    }

    @Override
    public void afiseaza(String indentare) {
        System.out.println(indentare + "Departament: " + denumire);

        for (Element element : elemente) {
            element.afiseaza(indentare + "  ");
        }
    }
}
