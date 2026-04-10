//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            Judecator j1 = new Judecator.JudecatorBuilder("Popescu", 12).build();
            Judecator j2  = new Judecator.JudecatorBuilder("IOnescu", 3).areDoctorat(true).build();
            Judecator j3  = new Judecator.JudecatorBuilder("Popescu", 12).areDoctorat(false).build();

    }
}