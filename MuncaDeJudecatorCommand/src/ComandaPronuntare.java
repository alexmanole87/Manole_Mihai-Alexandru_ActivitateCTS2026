public class ComandaPronuntare implements Comanda{
    private Judecator judecator;

    public ComandaPronuntare(Judecator judecator) {
        this.judecator = judecator;
    }

    @Override
    public void executa() {
        judecator.pronuntareHotarare();
    }

    @Override
    public void undo() {
        System.out.println("Pronunțarea a fost amânată");
    }
}
