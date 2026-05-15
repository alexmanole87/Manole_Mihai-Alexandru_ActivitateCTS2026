public class Semnatura extends Handler{
    @Override
    protected boolean problemaDetectata(CerereChemareInJudecata ccj) {
        return !ccj.isSemnata();
    }

    @Override
    protected void atentioneaza(CerereChemareInJudecata ccj) {
        System.out.println("Cerere nesemnată");
    }
}
