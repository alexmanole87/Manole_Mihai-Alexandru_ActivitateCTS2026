public class Rosu implements Culoare{
    @Override
    public void actiune(Semafor context) {
        System.out.println("Se face verde");
        context.setCuloare(new Verde());
    }
}
