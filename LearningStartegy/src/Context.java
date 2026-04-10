public class Context {

    private PaymentMethod metoda;

    public void setMetoda(PaymentMethod metoda){
        this.metoda = metoda;
    }

    public void  executarePlata(double sum){
        if (metoda == null){
            System.out.println("Nicio metoda selectata");
        }

        metoda.pay(sum);
    }
}
