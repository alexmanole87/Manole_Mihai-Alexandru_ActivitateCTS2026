//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ContUtilizator cu1 = new ContUtilizator("preferinte", "rol", "setari", "istoric");

        ContUtilizator cu2 = (ContUtilizator) cu1.clone();

        System.out.println(cu1==cu2);
    }
}