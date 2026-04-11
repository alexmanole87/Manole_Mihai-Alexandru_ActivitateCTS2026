public class Logat implements Stare {

    @Override
    public void actiune(Context context) {
        System.out.println("Userul se delogheaza");
        context.setStare(new DeLogat());
    }
}
