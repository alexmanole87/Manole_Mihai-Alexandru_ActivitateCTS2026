public class ExtraBranza extends   PizzaDecorator {

    public ExtraBranza(Pizza pizza) {
        super(pizza);
    }

    @Override
    public int pret() {
        return pizza.pret()+10;
    }
}
