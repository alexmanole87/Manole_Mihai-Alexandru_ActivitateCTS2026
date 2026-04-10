public class CompleteJudeJr extends CompletAbstarctConstructor{
    @Override
    public void descriereComplet() {
        System.out.println("Judecator Junior");
    }

    @Override
    public Jude createJ() {
        return new JudeJR();
    }

    @Override
    public Grefier createG() {
        return new GrefierSr();
    }
}
