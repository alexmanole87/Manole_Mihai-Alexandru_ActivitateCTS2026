public class FactoryMenuMixt implements FactoryMenu{
    @Override
    public void descriereMeniu() {
        System.out.println("Meniu cu supa de post si desert de dulce");
    }

    @Override
    public Supe createSUpa() {
        return new SupaDeCiuperci();
    }

    @Override
    public Deserturi createDesert() {
        return new CheeseCake();
    }
}
