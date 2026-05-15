public class CerereCompleta extends Handler{
    @Override
    protected boolean problemaDetectata(CerereChemareInJudecata ccj) {
        return ccj.isSemnata() && ccj.isTaxaCorecta() && ccj.isInstantaCompetenta();
    }

    @Override
    protected void atentioneaza(CerereChemareInJudecata ccj) {
        System.out.println("Cererea este gata pentru primul termen ");
    }
}
