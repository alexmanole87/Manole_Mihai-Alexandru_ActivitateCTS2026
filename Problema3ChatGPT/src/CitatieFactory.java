public class CitatieFactory extends DocumenteAbstarctFactory{
    @Override
    public DocumenteJuridice genereaza() {
        return new Citatie();
    }
}
