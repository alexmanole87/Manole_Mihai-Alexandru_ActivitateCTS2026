//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Rezervare r1 = new Rezervare.RezervareBuilder(true).scauneErgonoimice(false).masaDecorata(true).muzicaPersoanlizata(true).genMuzica("Rock").build();
        Rezervare r2 = new Rezervare.RezervareBuilder(false).scauneErgonoimice(true).muzicaPersoanlizata(false).build();
    }
}