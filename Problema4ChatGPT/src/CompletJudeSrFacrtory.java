public class CompletJudeSrFacrtory extends CompletAbstarctConstructor {
    @Override
    public void descriereComplet() {
        System.out.println("Jude senior");
    }

    @Override
    public Jude createJ() {
        return new JudeSr();
    }

    @Override
    public Grefier createG() {
        return new GrefierJr();
    }
}
