public class Jalapimio extends PizzaDecorator{
    public Jalapimio(Pizza pizza) {
        super(pizza);
    }

    @Override
    public int pret() {
        return pizza.pret()+3;
    }
}
