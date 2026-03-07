public class FactoryMenuDeDulce implements FactoryMenu{

    @Override
    public void descriereMeniu() {
        System.out.println("Meniu de Dulce");
    }

    @Override
    public Supe createSUpa() {
        return new supaDeVita();
    }

    @Override
    public Deserturi createDesert() {
        return new Papanasi();
    }
}
