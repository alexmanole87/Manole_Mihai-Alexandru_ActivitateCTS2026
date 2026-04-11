public class Galben implements Culoare{
    @Override
    public void actiune(Semafor context) {
        System.out.println("Se face roșu");
        context.setCuloare(new Rosu());
    }
}
