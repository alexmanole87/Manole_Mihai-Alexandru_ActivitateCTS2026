//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        GeneratorVechiHotarari generatorVechiHotarari = new GeneratorVechiHotarari();
        DocumentJudiciar adapter = new AdapterNouVechi(generatorVechiHotarari);
        adapter.genereazaDocument();
    }
}