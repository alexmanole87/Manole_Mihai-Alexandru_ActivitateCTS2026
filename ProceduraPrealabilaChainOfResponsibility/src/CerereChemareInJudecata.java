public class CerereChemareInJudecata {
    boolean semnata;
    boolean taxaCorecta;
    boolean instantaCompetenta;

    public CerereChemareInJudecata(boolean semnata, boolean taxaCorecta, boolean instantaCompetenta) {
        this.semnata = semnata;
        this.taxaCorecta = taxaCorecta;
        this.instantaCompetenta = instantaCompetenta;
    }

    public boolean isSemnata() {
        return semnata;
    }

    public boolean isTaxaCorecta() {
        return taxaCorecta;
    }

    public boolean isInstantaCompetenta() {
        return instantaCompetenta;
    }
}
