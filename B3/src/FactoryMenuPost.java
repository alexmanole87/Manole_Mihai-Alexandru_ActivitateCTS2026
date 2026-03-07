public class FactoryMenuPost implements FactoryMenu{
    @Override
    public void descriereMeniu() {
        System.out.println("Meniu de Post");
    }

    @Override
    public Supe createSUpa() {
        return new supaDeLegume();
    }

    @Override
    public Deserturi createDesert() {
        return new Clatite();
    }
}
