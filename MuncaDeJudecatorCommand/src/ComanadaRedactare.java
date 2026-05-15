public class ComanadaRedactare implements Comanda{
    private Judecator judecator;

    public ComanadaRedactare(Judecator judecator) {
        this.judecator = judecator;
    }

    @Override
    public void executa() {
        judecator.redactareHotarare();
    }

    @Override
    public void undo() {
        System.out.println("Hotărârea a fost ștearsă!");
    }
}
