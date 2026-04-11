public class Verde implements Culoare{
    @Override
    public void actiune(Semafor context) {
        System.out.println("Se face galben");
        context.setCuloare(new Galben());
    }
}
