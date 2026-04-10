//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            Context context = new Context();

            context.setMetoda(new PayCash());
            context.executarePlata(50);

            context.setMetoda(new PayCredit());
            context.executarePlata(100);

            context.setMetoda(new PayPayPal());
            context.executarePlata(1000);

    }
    }
