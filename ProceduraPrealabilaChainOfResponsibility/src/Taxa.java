public class Taxa extends Handler{
    @Override
    protected boolean problemaDetectata(CerereChemareInJudecata ccj) {
        return !ccj.isTaxaCorecta();
    }

    @Override
    protected void atentioneaza(CerereChemareInJudecata ccj) {
        System.out.println("Netimbrată sau insuficient timbrată");
    }
}
