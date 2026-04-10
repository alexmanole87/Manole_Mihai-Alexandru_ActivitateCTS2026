public class PayCash implements PaymentMethod{
    @Override
    public void pay(double sum) {
        System.out.println("A fost platita cash suma de " + sum + " lei.");
    }
}
