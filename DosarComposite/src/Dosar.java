import java.util.ArrayList;

public class Dosar implements Element{
    private String denumire;
    private ArrayList<Element> elementeDosar = new ArrayList<>();

    public Dosar(String nume) {
        this.denumire = nume;
    }

    public void adaugareElemente(Element element) {
        elementeDosar.add(element);
    }

    public void detasareElemente(Element element) {
        elementeDosar.remove(element);
    }

    @Override
    public void afiseaza(String identare) {
        System.out.println(identare +  "Dosar/Volum: " + denumire);

        for (Element element : elementeDosar) {
            element.afiseaza("identare" + " ");
        }
    }
}
