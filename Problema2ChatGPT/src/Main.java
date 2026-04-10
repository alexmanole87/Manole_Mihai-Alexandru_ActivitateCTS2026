//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            iFctJuridica p1 = SimpleFactoryFctJuridice.hire(FctJuridice.Judecator);
            iFctJuridica p2 = SimpleFactoryFctJuridice.hire(FctJuridice.Arhivar);

            p1.descriere();
            p2.descriere();
    }
}