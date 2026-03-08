abstract class InternareAbstract {
    abstract void triaj();
    abstract void  verificareDisponibilitateSalon();
    abstract void emitereFisaInternare();

    public final void ProceduraInternare(){
        triaj();
        verificareDisponibilitateSalon();
        emitereFisaInternare();
    }

}
