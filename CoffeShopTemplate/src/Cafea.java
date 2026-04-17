public class Cafea extends Bautura{
    @Override
    protected void preparaIngredient() {
        System.out.println("Se adauga cafea");
    }

    @Override
    protected void adaugaExtra() {
        System.out.println("Se adauga lapte");
    }
}
