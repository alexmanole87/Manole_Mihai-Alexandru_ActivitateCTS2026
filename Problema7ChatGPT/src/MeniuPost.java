public class MeniuPost implements MenuAbstract{
    @Override
    public void descriere() {
        System.out.println("Meniu Post:");
    }

    @Override
    public Mancare gateste() {
        return new SupaDeLegume();
    }

    @Override
    public Desert prepara() {
        return new DesertDePost();
    }
}
