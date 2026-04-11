public class DeLogat implements Stare{
    @Override
    public void actiune(Context context) {
        System.out.println("Userul se logheaza");
        context.setStare(new Logat());
    }
}
