public class MeniuNormal implements MenuAbstract{
    @Override
    public void descriere() {
        System.out.println("Meniu de dulce:");
    }

    @Override
    public Mancare gateste() {
        return new CiorbaDePui();
    }

    @Override
    public Desert prepara() {
        return new Prajitura();
    }
}
