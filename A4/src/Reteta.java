public class Reteta implements Prototype{

    private String numeSubstanta;
    private int cantittateSubstanta;

    public Reteta (String numeSubstanta, int cantittateSubstanta){
        this.numeSubstanta = numeSubstanta;
        this.cantittateSubstanta = cantittateSubstanta;
    }

    @Override
    public Prototype clone() {
        return new Reteta(numeSubstanta, cantittateSubstanta);
    }
}
