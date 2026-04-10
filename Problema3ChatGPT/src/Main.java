//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

            DocumenteJuridice dj1 = new CitatieFactory().genereaza();
            DocumenteJuridice dj2 = new IncheiereFactory().genereaza();

            dj1.descriere();
            dj2.descriere();

    }
}