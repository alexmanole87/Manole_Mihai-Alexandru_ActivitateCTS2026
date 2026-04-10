public class IncheiereFactory extends DocumenteAbstarctFactory{

    @Override
    public DocumenteJuridice genereaza() {
        return new Incheiere();
    }
}
