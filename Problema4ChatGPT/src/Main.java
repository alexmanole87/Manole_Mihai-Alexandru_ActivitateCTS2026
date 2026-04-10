//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        CompletAbstarctConstructor cjs = new CompletJudeSrFacrtory();
        CompletAbstarctConstructor cjj = new CompleteJudeJr();

        Jude j1 = cjs.createJ();
        Grefier g1 = cjs.createG();

        Jude j2 = cjj.createJ();
        Grefier g2 = cjj.createG();

        cjs.descriereComplet();
        j1.descriere();
        g1.descriere();


        cjj.descriereComplet();
        j2.descriere();
        g2.descriere();
    }
}