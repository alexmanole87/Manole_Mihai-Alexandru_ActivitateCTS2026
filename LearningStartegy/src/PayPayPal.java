public class PayPayPal implements PaymentMethod{
    @Override
    public void pay(double sum) {
        System.out.println("Prin PayPal a fost plătită suma de " + sum + " lei");
    }
}
