public class Compenta extends Handler{
    @Override
    protected boolean problemaDetectata(CerereChemareInJudecata ccj) {
        return !ccj.isInstantaCompetenta();
    }

    @Override
    protected void atentioneaza(CerereChemareInJudecata ccj) {
        System.out.println("Instanta necompetenta");
    }
}
