public class InternareGripa extends InternareAbstract{
    @Override
    void triaj() {
        System.out.println("Rosu, Galben, Verde, Alb");
    }

    @Override
    void verificareDisponibilitateSalon() {
        System.out.println("Salon Liber!");
    }

    @Override
    void emitereFisaInternare() {
        System.out.println("Fisa Emisa!");
    }
}
