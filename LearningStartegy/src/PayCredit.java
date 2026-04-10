public class PayCredit implements PaymentMethod{
    @Override
    public void pay(double sum) {
        System.out.println("Contul a fost debitat cu suma de " + sum + " lei");
    }
}

