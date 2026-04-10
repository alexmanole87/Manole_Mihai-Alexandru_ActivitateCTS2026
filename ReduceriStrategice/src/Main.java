//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            Context c = new Context();

            c.setTipReducere(new Student());
            c.aplicareReducere(100);

            c.setTipReducere(new Senior());
            c.aplicareReducere(100);

            c.setTipReducere(new FaraReducrere());
            c.aplicareReducere(100);
    }
}