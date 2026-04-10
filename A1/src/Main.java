//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Pacient p1 = new Pacient.PacientBuilder(true).halatInterior(false).micDejunInclus(true).papuciCamera(false).build();

        Pacient p2 = new Pacient.PacientBuilder(false).halatInterior(true).micDejunInclus(true).build();

    }
}